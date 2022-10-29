package kr.co.ezenac.field;

public class ExTest {

	public static void main(String[] args) {
//		Tv t = new Tv();
//		t.channel = 7;
//		t.channelUp();
//		System.out.println(t.channel);
//		t.volume = 10;
//		while (t.volume > 3) {
//			t.volumeDown();
//		}
//		System.out.println(t.volume);
		
	
		
	}

}

class Tv {
	String color;
	boolean power;
	int channel;
	int volume;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	void volumeUp() {
		++volume;
	}

	void volumeDown() {
		--volume;
	}

}
