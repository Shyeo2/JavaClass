package study;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		//super();
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	int average() {
		return (math + science + english) / 3;
	}
	
}
