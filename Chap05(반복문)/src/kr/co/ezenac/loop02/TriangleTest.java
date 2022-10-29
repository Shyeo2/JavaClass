package kr.co.ezenac.loop02;

import java.util.Scanner;

/*
 *   ********
 *   *******
 *   ******
 *   *****
 *   ****
 *   ***
 *   **
 *   *
 *   
 */
public class TriangleTest {

	public static void main(String[] args) {
//		
		for(int i = 1; i <=8; i++) {
			for(int j =8; j >=i; j--) {
				System.out.print("*");
			}
				System.out.println("");
		}
//	
//		for (int i = 0; i <8; i++) {
//			for (int j = i; j < 8; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		   }
////		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
//	
	
	}

}
