package kr.co.ezenac.playerlevel;

public class PlayerLevelTest {

	public static void main(String[] args) {
		System.out.println("***** 초급자 레벨입니다 *****");
		PlayerLevel level = new BeginnerLevel();
		level.go();
		
		System.out.println("***** 중급자 레벨입니다 *****");
		PlayerLevel level2 = new AdvancedLevel();
		level2.go();
		
		System.out.println("***** 고급자 레벨입니다 *****");
		PlayerLevel level3 = new SuperLevel();
		level3.go();
	}	

}
