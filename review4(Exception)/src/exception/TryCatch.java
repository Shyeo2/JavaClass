package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int num1 = scan.nextInt() ;
			int num2 = 10/num1;
			System.out.println(num2);
			System.out.println("Good bye~");
		}
		catch (ArithmeticException e) {
			String str = e.getMessage();
			System.out.println(str);
			if(str.equals("/ by zero"))
				System.out.println("0으로 나눌 수 없습니다.");
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
