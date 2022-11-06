package exception;

import java.util.Scanner;

public class Exception_ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int num1 = scan.nextInt();
			int num2 = 10/num1;
			System.out.println(num2);
		}
		catch (Exception e) {	//1
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("예외발생"); //
		}
		System.out.println("Good bye~");
	}
}
