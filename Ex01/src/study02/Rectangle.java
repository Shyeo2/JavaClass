package study02;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;

	public Rectangle(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}

	public boolean contains(Rectangle r) {
		if (r.x + r.width <= width && r.y + r.height <= width)
			return true;
		else return false;

	}
}
