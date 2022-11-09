package study;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scanner.close();

	}

}
