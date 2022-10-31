package kr.co.ezenac.playerlevel;

public abstract class PlayerLevel {

	final public void go() {
		run();
		
		jump();
		turn();

	}

	public abstract void turn();

	public abstract void jump();

	public abstract void run();

}
