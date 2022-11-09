package kr.co.ezenac.innerclass;

class Outter {
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			int localNum = 10;

			@Override
			public void run() {
				//i = 100;		//매개변수는 상수로 바뀜
				//num = 200;	//지역변수는 상수로 바뀜
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
			}

		}
		;
		
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Runnable runnable= outter.getRunnable(10);
		runnable.run();
		
		outter.runner.run();
	}
}
