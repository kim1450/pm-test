package prac;

class Point2{
	private int x,y;
	public Point2(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() { 
		return "Point2("+x+","+y+")";
	}
}
public class ObjectPropertyEx2 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Point2 p = new Point2(2,3);
		print(p);
		
		// call toString() method
		System.out.println(p.toString());
		System.out.println(p); //automatically converts p to p.toString()
		System.out.println(p+"입니다.");
	}

}
