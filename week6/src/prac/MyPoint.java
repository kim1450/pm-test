package prac;

class MyPoint {
	protected int x;
	protected int y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("x의 좌표: " + x);
		System.out.println("y의 좌표: " + y);
	}
}
