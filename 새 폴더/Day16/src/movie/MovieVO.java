package movie;

public class MovieVO {
	int movieNum=0;
	String title=null;
	String supervision=null;
	String year=null;
	int price=0;

	public MovieVO(){}

	public MovieVO(int MovieNum, String title, String supervision, String year, int price) {
		this.movieNum=MovieNum;
		this.title = title;
		this.supervision = supervision;
		this.year = year;
		this.price = price;

	}

	public int getMovieNum() {
		return movieNum;
	}

	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSupervision() {
		return supervision;
	}

	public void setSupervision(String supervision) {
		this.supervision = supervision;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Movie[movieNum: "+movieNum+"/title: "+title+"/supervision: "+supervision+"/year: "+year+"/price: "+price+"]";
	}

}
