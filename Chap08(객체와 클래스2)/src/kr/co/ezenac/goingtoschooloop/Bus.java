package kr.co.ezenac.goingtoschooloop;

//public class Bus {
//
//	int busNumber;
//	int passengerCount;
//	int money;
//
//	public Bus(int busNumber) {
//		// super();
//		this.busNumber = busNumber;
//	}
//
//	// 승차하다
//	public void ride(int money) {
//		this.money += money;
//		passengerCount++;
//	}
//
//	public void showIntfo() {
//		System.out.println(busNumber + "번의 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
//	}
//
//}
public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber, int passengerCount, int money) {
		//super();
		this.busNumber = busNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showIntfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
}