package kr.co.ezenac.goingtoschooloop;

//public class Subway {
//	
//	int lineNumber;
//	int passengerCount;
//	int money;
//	
//	public Subway(int lineNumber) {
//		//super();
//		this.lineNumber = lineNumber;
//	} 
//	
//	public void ride(int money) {
//		this.money += money;
//		passengerCount++;
//	}
//	
//	public void showIntfo() {
//		System.out.println(lineNumber + "호선의 지하철의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
//	}
//
//}

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber, int passengerCount, int money) {
		//super();
		this.lineNumber = lineNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	
	public void ride(int money) {
		this.money += money;
		passengerCount++;
			
	}
	public void showIntfo() {
		System.out.println(lineNumber + "호선의 지하철의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
}