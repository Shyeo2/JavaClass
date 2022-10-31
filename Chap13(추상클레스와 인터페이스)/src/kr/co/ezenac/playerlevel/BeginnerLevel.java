package kr.co.ezenac.playerlevel;

public class BeginnerLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("jump 못합니다.");
		
	}
	@Override
	public void turn() {
		System.out.println("turn 못합니다.");
		
	}
}
