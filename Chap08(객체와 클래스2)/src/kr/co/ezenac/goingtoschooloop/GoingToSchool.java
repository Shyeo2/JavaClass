package kr.co.ezenac.goingtoschooloop;

//public class GoingToSchool {
//
//	public static void main(String[] args) {
//		Student student = new Student("최선혜", 3000 );
//		Student student2 = new Student("심사임당", 5000);
//		
//		Bus bus100 = new Bus(100);
//		Subway subway9 = new Subway(9);
//		
//		student.takeBus(bus100);
//		student.takeSubway(subway9);
//		
//		student.showIntfo();
//		student2.showIntfo();
//		
//		bus100.showIntfo();
//		subway9.showIntfo();
//		
//	}
//
//}
public class GoingToSchool {
	public static void main(String[] args) {
		Student student = new Student("최선혜", 4, 5000);
		Student student2 = new Student("신사임당", 6, 50000);
		
		Bus bus100 = new Bus(100, 0, 1250);
		Subway subway9 = new Subway(2, 1, 1300);
		
		student.takeBus(bus100);
		student.takeSubway(subway9);
		
		student2.takeBus(bus100);
		student2.takeSubway(subway9);
		
		student.showIntfo();
		student2.showIntfo();
		
		bus100.showIntfo();
		subway9.showIntfo();
		
	}
}