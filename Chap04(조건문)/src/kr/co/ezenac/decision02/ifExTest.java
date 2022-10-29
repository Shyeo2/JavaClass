package kr.co.ezenac.decision02;

import java.util.Scanner;

public class ifExTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println(10000 + (num1 * 1000));
		}
		else if (num1 == num2 || num1 == num3 ) {
			System.out.println(1000 + (num1 * 100));
		}
		else if (num2 == num3) {
			System.out.println(1000 + (num2 * 100));
		}
		else {
			int max = num1;
				if(max < num2) {
					max = num2;
				}
				if(max < num3) {
					max = num3;
				}
				System.out.println(max*100);
		}
		scan.close();	
	}

}
