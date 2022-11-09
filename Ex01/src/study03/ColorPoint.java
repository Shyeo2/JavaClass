package study03;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y); 
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	

	@Override
	public String toString() {
		return color +"색의 " +"(" + getX() +"," + getY()+")" +"의 점입니다.";
	}
	public static void main(String[] args) {
		
	}
}
