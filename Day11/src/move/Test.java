package move;
import java.util.Random;
public class Test {

	public static void main(String[] args) {
		Random random =new Random();
		Movable[] s=new Movable[3];
		s[0]=new Ractangle();
		s[1]=new Ractangle();
		s[2]=new Circle();
		
		for(int i=0;i<s.length;i++){
			s[i].move(random.nextInt(100), random.nextInt(100));
			System.out.print(((Shape) s[i]).getX()+",");
			System.out.println(((Shape) s[i]).getY());
		}
	
		
		
		
		
	}

}
