package kr.co.ezenac.constructor02;

public class StudentTest {

	public static void main(String[] args) {
		// 기본 생성자 호출
		Student student = new Student();
		System.out.println(student.getAge());
		System.out.println(student.toString());

		System.out.println();
		// 매개변수가 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);

		System.out.println();
		// 매개변수 String형 하나 있는 생성자 호출
		Student student3 = new Student("신사임당");
		System.out.println(student3.getName());

		System.out.println();
		// 매개변수 int형 하나 있는 생성자 호출
		Student student4 = new Student(150);
		System.out.println(student4.getAge());
	}

}
