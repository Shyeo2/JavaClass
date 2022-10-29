package kr.co.ezenac.loop;

import java.util.Scanner;

public class ForExTest01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int total = scan.nextInt();			
		int count = scan.nextInt();			
		int result = 0;						
			
			for (int i = 1; i <= count; i++) {  
				int price = scan.nextInt();
				int num = scan.nextInt();
				
				result += price * num;
				
			}
				if (total == result) {
				System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
					
				
			
			
		scan.close();
     }
}	