
public class ClassTest {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.name = "홍길동";
		student.ban = 1;
		student.no = 1;
		student.kor = 100;
		student.eng = 60;
		student.math = 76;

		System.out.println("이름:" + student.name);
		System.out.println("총점:" + student.getTotal());
	//	System.out.println("평균:" + student.getAverage());
		
	}

}
