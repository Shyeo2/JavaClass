package kr.co.ezenac.constructor03;

public class Car {

	String color;
	String gearType;
	int door;

	/* 
	 * this
	 * 	- 참조변수와 같은 역할
	 *  - 매개변수와 멤버변수를 구분짖는데 사용
	 *    (this 사용해서 명확하게 프로그램 실행되도록 함)
	 */
	// 기본생성자
	public Car() {
		// 직접적으로 인스턴스 멤버변수를 초기화
//		this.color = "검정";
//		this.gearType = "수동";
//		this.door = 3;
		this("검정", "수동", 4);
	}

	public Car(String color, String gearType, int door) {
		//super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return this.color + ", " + this.gearType + ", " + this.door;
	}
}
