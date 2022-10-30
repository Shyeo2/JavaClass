package kr.co.ezenac.reference;

public class Student {
	
	int studentID;
	String studentname;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentname = name;
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}	
		//setMathSubject()
		
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentname + "학생의 총점은" + total + "점 입니다.");
	}
}
