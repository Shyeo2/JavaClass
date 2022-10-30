package kr.co.ezenac.singleton02;

/*
 * * 자동차 공장이 있습니다.
 * 	 자동차 공장은 유일한 객체이고, 이 공장에서 생성되는 자동차는 생산될때마다 고유의 차 번호가 부여됩니다.
 * 	 자동차 번호가 1001부터 시작되어 차가 생성될때마다
 * 	 1002, 1003번 이렇게 번호가 부여되도록 자동차 공장 클래스(싱글톤 패턴), 자동차 클래스(static 변수)를 구현하시오.
 * 
 *   객체를 구현하여 실행결과가 나오도록 구현하시오.
 *   
 *   1001(출력)
 *   1002(출력)
 *   
 * 
 */
public class Car {
	private static int SerialNum = 1000;
	int carNum;
	
	private void creatCar() {
		Car.SerialNum++;
		carNum = SerialNum;
 	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	
	
	


}
