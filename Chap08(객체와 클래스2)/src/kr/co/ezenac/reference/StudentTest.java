package kr.co.ezenac.reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student(100, "이순신");
		student.setKoreaSubject("국어:", 70);
		student.setMathSubject("수학", 90);
		
		student.showStudentScore();
		
		Student student2 = new Student(95, "신사임당");
		student2.setKoreaSubject("국어", 100);
		student2.setMathSubject("수학", 1000);
		
		student2.showStudentScore();
		
	}

}


