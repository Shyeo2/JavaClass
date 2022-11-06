package exception;

public class ExceptionThrow {
	
	public static void MyMethod1(int n) {
		MyMethod2(n,0);
	}
	
	public static void MyMethod2(int n1, int n2) {
		int r = n1 / n2;		//1.예외발생지점 
	}
	
	public static void main(String[] args) {
		MyMethod1(3);
		System.out.println("Exception Throw!!"); 	//2
	}
}	
