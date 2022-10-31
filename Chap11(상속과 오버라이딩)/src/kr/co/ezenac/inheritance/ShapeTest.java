package kr.co.ezenac.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150, 150), 500);
		circle2.draw();
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		System.out.println();
		
		Triangle triangle2 = new Triangle(new Point(10, 10), new Point(20,20), new Point(30,30));
		triangle.draw();
		System.out.println();
		
		Point[] points = new Point[] {new Point(10,10), new Point(80,100), new Point(20,120)};
		Triangle triangle3 = new Triangle(points);
		triangle3.draw();
		
	}

}
