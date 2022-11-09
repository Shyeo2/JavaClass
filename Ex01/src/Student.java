
public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {
	}

	int getTotal() {
		return kor + eng + math;
	}
//	float getAverage() {
//		return(int)(getTotal() / 3f * 10 + 0.5f) / 10.0f;
//	}
}
