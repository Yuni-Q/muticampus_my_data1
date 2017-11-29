package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import vo.BookVO;

//@WebServlet(urlPatterns="/book.do")
public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, resp);
	}//book.do ��û�� get ������� ���� �� �����.

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, resp);
	}//book.do ��û�� post ������� ���� �� �����.
	
	public void process(HttpServletRequest request, HttpServletResponse respo) throws ServletException, IOException{
	
		String type = request.getParameter("type");
		BookDao dao = new BookDao();
		
		String viewPath="";
		
		
		if(type.equals("booklist")){
			//å ��Ϻ��⸦ ���� �۾� ���� �κ�
			List<BookVO> bookList = dao.selectAll();
			
			//�۾��� ��� �����͸� request ���� ��ü�� ��Ƽ�
			request.setAttribute("bookList", bookList);
			//book_list.jsp���� forward��.
			viewPath = "book_list.jsp";
		}else if(type.equals("insertform")){
			//å �߰��� �ʿ��� �۾� ����
			viewPath = "insert_form.jsp";
		}else if(type.equals("insert")){
			//����, ���ǻ�, ����, �⵵ ������ �� ����� �۾�
			String title = request.getParameter("title");
			String publisher = request.getParameter("pub");
			String year = request.getParameter("year");
			String priceStr = request.getParameter("price");
			
			int price = Integer.parseInt(priceStr);
			BookVO book = new BookVO(title,publisher,price,year);
			
			int result = dao.insert(book);
			
			request.setAttribute("insertResult", result);
			
			viewPath = "insert_result.jsp";
			
		}
		else if(type.equals("updateform")){
			//å ������ �ʿ��� �۾� ����
			viewPath = "update_form.jsp";
		}
		else if(type.equals("update")){
			//å ������ �ʿ��� �۾� ����
			String bookNumStr = request.getParameter("bookNum");
			String title = request.getParameter("title");
			String publisher = request.getParameter("pub");
			String year = request.getParameter("year");
			String priceStr = request.getParameter("price");
			
			int bookNum = Integer.parseInt(bookNumStr);
			int price = Integer.parseInt(priceStr);
			
			BookVO book = new BookVO(bookNum, title,publisher,price,year);
			
			int result = dao.update(book);
			
			request.setAttribute("updateResult", result);
						
			viewPath = "update_result.jsp";
		}
		else if(type.equals("deleteform")){
			//å ������ �ʿ��� �۾� ����
			viewPath = "delete_form.jsp";
		}else if(type.equals("delete")){
			//å ������ �ʿ��� �۾� ����
			String bookNumStr = request.getParameter("bookNum");
			
			int bookNum = Integer.parseInt(bookNumStr);
			
			int result = dao.delete(bookNum);
			
			request.setAttribute("deleteResult", result);
			
			viewPath = "delete_result.jsp";
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, respo);
	}
}
