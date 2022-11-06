package exception;

import java.util.Scanner;

public class WhyThrow {
	
	public static void myMethod1() {
		try {
			myMethodA();
		}
		catch (Throwable e) {
			System.out.println("에러!");
		}
	}
	
	public static void myMethod2() {
		try {
			myMethodA();
		}
		catch (Throwable e) {
			System.out.println("Error!");
		}
	}

	public static void myMethodA() {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();	//에러발생지점
		int num2 = 10/num1;			//에러발생지점
		System.out.println(num2);
		
	}
	public static void main(String[] args) {
		myMethod1();		//1."에러!"출력
		myMethod2();		//2."Error!"출력 
	}
	
}
