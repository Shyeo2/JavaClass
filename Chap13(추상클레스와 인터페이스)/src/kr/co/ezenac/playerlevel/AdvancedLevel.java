package kr.co.ezenac.playerlevel;

public class AdvancedLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}
	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
		System.out.println("높이 jump합니다.");
	}
	@Override
	public void turn() {
		System.out.println("turn 못합니다.");
		
	}
}
