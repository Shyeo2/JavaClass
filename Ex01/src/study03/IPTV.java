package study03;

public class IPTV extends ColorTV {
	
	private String address;

	
	public IPTV(int size, int color, String address) {
		super(size, color);
		this.address = address;
	}


	
	void printProperty() {
		System.out.println("나의 IPTV는 " + address + "주소의 " + getSize()+ "인치 " + getColor() +"컬러");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV(32, 2048, "192.1.1.2");
		
		iptv.printProperty();
	}
}
