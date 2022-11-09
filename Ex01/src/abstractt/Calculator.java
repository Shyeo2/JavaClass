package abstractt;

abstract class Calculator {
	public abstract int add (int a, int b);			//두 정수의 합을 구하여 리턴
	public abstract int subtract(int a, int b);		// 두 정수의 차를 구하여 리턴
	public abstract double average (int[]a);		// 배열에 저장된 정수의 평균 리턴
}
