package box;

public class Box {
	int width;
	int length;
	int height;
	int volume;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume(){
		volume=width*length*height;
		return volume;
	}
	public void print(){
		System.out.println(width);
		System.out.println(length);
		System.out.println(volume);
		
	}
	
}
