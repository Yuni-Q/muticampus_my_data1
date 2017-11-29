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
	}//book.do 요청이 get 방식으로 들어올 때 실행됨.

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, resp);
	}//book.do 요청이 post 방식으로 들어올 때 실행됨.
	
	public void process(HttpServletRequest request, HttpServletResponse respo) throws ServletException, IOException{
	
		String type = request.getParameter("type");
		BookDao dao = new BookDao();
		
		String viewPath="";
		
		
		if(type.equals("booklist")){
			//책 목록보기를 위한 작업 수행 부분
			List<BookVO> bookList = dao.selectAll();
			
			//작업한 결과 데잉터를 request 내장 객체에 담아서
			request.setAttribute("bookList", bookList);
			//book_list.jsp에게 forward함.
			viewPath = "book_list.jsp";
		}else if(type.equals("insertform")){
			//책 추가에 필요한 작업 수행
			viewPath = "insert_form.jsp";
		}else if(type.equals("insert")){
			//제목, 출판사, 가격, 년도 정보가 온 경우의 작업
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
			//책 수정에 필요한 작업 수행
			viewPath = "update_form.jsp";
		}
		else if(type.equals("update")){
			//책 수정에 필요한 작업 수행
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
			//책 수정에 필요한 작업 수행
			viewPath = "delete_form.jsp";
		}else if(type.equals("delete")){
			//책 삭제에 필요한 작업 수행
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
