package kr.co.ezenac.goingtoschooloop;

//public class Student {
//	String studentName;
//	int grade;
//	int money;
//	
//	public Student(String studentName, int money) {
//		//super();
//		this.studentName = studentName;
//		this.money = money;
//	}
//	
//	public void takeBus(Bus bus) {
//		bus.ride(1250);
//		this.money -= 1250;
//	}
//	
//	public void takeSubway(Subway subway) {
//		subway.ride(1300);
//		this.money -= 1300;
//		
//	}
//	public void showIntfo() {
//		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
//	}
//
//}
	public class Student {
		String studentName;
		int grade;
		int money;
		public Student(String studentName, int grade, int money) {
			//super();
			this.studentName = studentName;
			this.grade = grade;
			this.money = money;
		}
		
	public void takeBus (Bus bus) {
		bus.ride(1250);
		this.money -= 1250;
	
	}
	public void takeSubway (Subway subway) {
		subway.ride(1300);
		this.money -= 1300;
	}
	public void showIntfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
	}
		
	}