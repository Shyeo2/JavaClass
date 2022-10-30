package kr.co.ezenac.singleton02;

public class CarFactory {

	private static CarFactory instance;
	
	private CarFactory() {
		
	}
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public void creatCar() {
		Car car = new Car();
		
	
	
		
	}
	
	
}
