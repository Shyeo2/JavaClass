package study02;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle[] c = new Circle[3];						//3개의 Circle 배열 선언
		for(int i = 0 ; i < c.length; i++) {			
			System.out.print("x , y, radius>>");
			double x = scan.nextDouble();				// x값 읽기
			double y = scan.nextDouble();				// y값 읽기
			int radius = scan.nextInt();				// 반지름 읽기
			c[i] = new Circle(x, y, radius);			// Circle 객체 생성
		}
		for(int i = 0; i <c.length; i++)  {				// 모든 Circle 객체 출력
			c[i].show();
			scan.close();
		}
		
	}

}
