package test03;

public class Movie {
	private String title = "보스베이비";
	private double point = 5.0;
	private String boss= "박찬욱";
	private int year=2017;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void print(){
		System.out.println(title);
		System.out.println(point);
		System.out.println(boss);
		System.out.println(year);
		
	}
	
	
	
	
	
	
	
}
