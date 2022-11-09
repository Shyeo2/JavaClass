package study02;

public class Circle {
	private double x;
	private double y;
	private int radius;

	public Circle(double x, double y, int radius) {

		this.x = x;					//x, y, radius 초기화
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")"+radius);
	}

}
