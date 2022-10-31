package kr.co.ezenac.playerlevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
		
	}
	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
		System.out.println("아주 높이 jump합니다.");
		System.out.println("아주 높이 jump합니다.");
		
	}
	@Override
	public void turn() {
		System.out.println("turn 합니다.");
		
	}
}
