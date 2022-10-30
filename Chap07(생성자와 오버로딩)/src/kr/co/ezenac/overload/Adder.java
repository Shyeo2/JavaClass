package kr.co.ezenac.overload;

public class Adder {

	// add() 메서드명으로 오버로딩함
//	public int add(int x, int y) {
//		System.out.println(" add(int x, int y)");
//		return x + y;
//	}
	// 오버로딩 아님
//	public int add(int a, int b) {
//		returㄹn a + b;
//	}
	// 오버로딩 아님
//	public long add(int x, int y) {
//		return x + y;
//	}
	
//	public long add(int x, long y) {
//		System.out.println("add(int x, long y)");
//		return x + y;
//	}
//	
//	public double add(double x, double y) {
//		System.out.println("add(double x, double y)");
//		return x = y;
//	}
	
	public int getSum(int i , int j) {
		return i + j;
		
	}
	public int getSum(int i, int j, int k) {
		return i + j + k;
	}
	public double getSum(double i, double j) {
		return i + j;
	}
	
	
}
