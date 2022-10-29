package kr.co.ezenac.member02;

//public class Student {

//	public int studentId;
//	public String studentName;
//	public int grade;
//	public Student(int studentId, String studentName, int grade) {
//		//super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.grade = grade;
//		
//		
//	}
//
//	
//
//	public String showStudentInfo() {
//		return studentName + "학생의 학번은" + studentId + "이고, " + grade + "학년 입니다.";
//	}
	
	public class Student {
	public int studentId;
	public String studentName;
	public int grade;
	public Student(int studentId, String studentName, int grade) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은" + studentId + "이고" + grade + "학년 입니다.";
		
	}
	
	
	}

