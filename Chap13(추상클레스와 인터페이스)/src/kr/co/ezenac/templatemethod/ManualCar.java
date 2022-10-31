package kr.co.ezenac.templatemethod;

public class ManualCar extends Car {

	@Override
	public void stop() {
		System.out.println("브레이크를 밞아서 정지합니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
		
		
	}
	
//	public void stop() {
//		System.out.println("브레이크를 밞아서 정지합니다.");
//	}
//	
//	public void drive() {
//		System.out.println("사람이 운전합니다.");
//		System.out.println("사람이 핸들을 조작합니다.");
//	
//	}
}