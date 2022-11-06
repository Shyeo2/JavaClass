package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchConcat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int num1 = scan.nextInt();
			int num2 = 10/num1;
			System.out.println(num2);
		}
		catch (ArithmeticException | InputMismatchException e) { //1.예외처리
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("예외발생"); //2
		}
		System.out.println("Good bye~"); //3
	}
}
