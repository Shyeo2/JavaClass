package kr.co.ezenac01;
	public class BeginerLevel extends PlayerLevel {

		@Override
		public void run() {
			System.out.println("천천히 달립니다.");

		}

		@Override
		public void jump() {
			System.out.println("점프를 하지 못합니다.");

		}

		@Override
		public void turn() {
			System.out.println("방향 전환을 하지 못합니다.");

		}
		
		@Override
		public void showLevelMessage() {
			System.out.println("플레이어는 초급자입니다.");
			
		}

	}

