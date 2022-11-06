package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsInMethod {
	
	public static void myMethod1() {	//1
		myMethod2();
	}
	
	
	public static void myMethod2()throws
		ArithmeticException, InputMismatchException { //2.메서드에 예외선언
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();	//예외발생지점
		int num2 = 10 / num1;		//예외발생지점
		System.out.println(num2);
	}

	public static void main(String[] args) {
		try {
			myMethod1();
		}
		catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("---------");

	}

}
