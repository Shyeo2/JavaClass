package kr.co.ezenac.member;

public class Monitor {
	
	//멤버변수 (필드)
	String color;		//모니터의 색상
	int channel;        //채널
	int volume;			//볼륨
	boolean power;		//전원
	
	//멤버메서드
	//Monitor를 켜거나 끄는 기능
	public void power() {
		if(!power) {
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power; 
		} else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;
		}
	}
	public void channelUP() {
		this.channel++;
		System.out.println("현재 채널 : "+ this.channel);
	}
	public void channelDown() {
		System.out.println("현재 채널 : " + --this.channel);
	}

}
