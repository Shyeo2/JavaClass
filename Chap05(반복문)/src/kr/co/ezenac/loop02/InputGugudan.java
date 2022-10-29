package kr.co.ezenac.loop02;

import java.util.Scanner;

/*
 * 구구단을 출력합니다.
 * 몇 단부터 출력할까요?  :(입력 3)
 * 끝 단은 얼마인가요? : (입력 5)
 *
 *===========3단============
 *
 */
public class InputGugudan {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("구구단을 출력합니다.");
//		System.out.println("몇 단부터 출력할까요?");
//		int gugudan1 = scan.nextInt();
//		System.out.println("끝 단은 얼마인가요?");
//		int gugudan2 = scan.nextInt();
//
//		for (int i = gugudan1; i <= gugudan2; i++) {
//			System.out.println("========" + i + "단========");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "*" + j + "=" + (i * j));
//				
//			}
//		}
//		scan.close();
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i = N; i <= N; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) );
			}
		}
		scan.close();
	}

}
