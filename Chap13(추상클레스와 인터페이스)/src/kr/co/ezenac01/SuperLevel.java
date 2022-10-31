package kr.co.ezenac01;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 합니다.");

	}

	@Override
	public void turn() {
		System.out.println("방향 전환을 합니다.");

	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("플레이어는 상급자입니다.");
		
	}

}