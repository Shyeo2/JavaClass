package study02;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return (math + science + english ) / 3;
	}
	
	
}
