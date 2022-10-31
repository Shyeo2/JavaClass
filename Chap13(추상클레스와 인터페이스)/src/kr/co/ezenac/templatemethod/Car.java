package kr.co.ezenac.templatemethod;

//public abstract class Car {
//	
//	final public void run() {
//		startCar();
//		drive();
//		stop();
//		turnOff();
//		
//	}
//	
//	
//	private void turnOff() {
//		System.out.println("시동을 끕니다.");
//		
//	}
//
//
//	public abstract void stop();
//		
//		
//	
//	public abstract void drive();
//		
//		
//	
//	public void startCar () {
//		System.out.println("시동을 켭니다.");
//	}
//}

public abstract class Car {

	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();

	}

	private void turnoff() {
		System.out.println("시동을 끕니다.");

	}

	public abstract void stop();

	public abstract void drive();

	private void startCar() {
		System.out.println("시동을 켭니다.");
	}

}