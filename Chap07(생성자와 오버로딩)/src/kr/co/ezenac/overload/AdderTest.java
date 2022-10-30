package kr.co.ezenac.overload;

public class AdderTest {

	public static void main(String[] args) {
//		Adder adder = new Adder();
//		int iResult = adder.add(10, 50);
//		System.out.println("iResult : " + iResult);
//		
//		long lResult = adder.add(100, 7500L);
//		System.out.println("lResult : " + lResult);
//	
//		double dResult = adder.add(107.55, 12.24);
//			System.out.println("dResult : " + dResult);
		
		Adder adder = new Adder();
		
		int i = adder.getSum(1, 2);
		
		int j = adder.getSum(1, 2, 3);
		
		double k = adder.getSum(1.1, 2.2);
	
		System.out.println(i + j + k);
	
	
	
	
		}
	
	
	}


