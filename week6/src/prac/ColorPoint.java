package prac;

class ColorPoint extends MyPoint {
	protected String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
