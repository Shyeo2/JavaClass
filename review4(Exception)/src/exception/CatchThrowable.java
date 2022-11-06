package exception;

import java.util.Scanner;

public class CatchThrowable {
	public static void myMethod1() {
		myMethod2(); //1
	}
	
	public static void myMethod2() {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt(); 	//2.에러발생지점
		int num2 = 10 / num1;		//3.에러발생지점
		System.out.println(num2);
		
	}

	public static void main(String[] args) {
		try {
			myMethod1();	//5.myMethod1()으로부터 예외가 넘어옴
		}
		catch (Throwable e) {	//6.
				e.printStackTrace();
				//System.out.println(e.getMessage()); 
		}
	}

}
