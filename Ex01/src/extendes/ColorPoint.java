package extendes;

public class ColorPoint extends Point {
	private String color;


	
	public ColorPoint(int x,  int y, String color) {
		super(x, y);
		this.color = color;
	}



	public void showColorpoint() {
		System.out.println(color);
		showPoint();
		
	}
}
