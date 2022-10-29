package kr.co.ezenac.member;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(1111);
		student.setStudentname("최선혜");
		student.setStudentaddress("수원시 호매실동");
		
		
		student.showInfo();
		
	}
}