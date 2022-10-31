package kr.co.ezenac01;

public abstract class PlayerLevel {
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++)
			jump();
			turn();
		System.out.println();
	}

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	
}
