class MyPoint {

	private int x, y;

	

	public MyPoint() {

			this.x = 0;

			this.y = 0;

	}

	

	public MyPoint(int x, int y) {

		this.x = x;

		this.y = y;

	}

	

	public void showPoint() {

		System.out.println("(" + x + "," + y + ")");

	}

}





class ColorPoint extends MyPoint {

	private String color;

	private int x;

	private int y;

	

	public ColorPoint(int x, int y, String color) {

		super(x,y);

		this.color = color;

	}

	

	public void showColorPoint() {

		System.out.println(color);

		showPoint();

	}

}