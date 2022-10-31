package kr.co.ezenac.interfacee;

public class CompleteCalculatorTest {

	public static void main(String[] args) {
		Calc cal = new CompleteCalculator();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + " + " + num2 + " = " + cal.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + cal.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + cal.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + cal.divide(num1, num2));

	}

}