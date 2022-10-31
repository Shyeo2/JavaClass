package kr.co.ezenac01;


	/* 
	 *  상속이 제한되는 final
	 *  1) 변수
	 *  	- final 변수는 상수를 의미함.
	 *  2) 메서드
	 *  	- final 메서드는 하위 클래스에서 오버라이딩을 할 수 없음
	 *  3) 클래스
	 *  	- final 클래스는 상속을 할 수 없음
	 */
	public class PlayerTest2 {

		public static void main(String[] args) {
			Player player = new Player();
			player.play(1);
			
			
			PlayerLevel aplayer = new AdvancedLevel();
			player.upgradeLevel(aplayer);
			player.play(2);
			
			PlayerLevel splayer = new SuperLevel();
			player.upgradeLevel(splayer);
			player.play(3);

		}

	}


