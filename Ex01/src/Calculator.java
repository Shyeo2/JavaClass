/*
 * 다음의 클래스에 주어진 정수가 홀수인지 짝수인지 판별해 주는 메서드(isOdd)를 추가해 보자.
 *  (홀수이면 true, 짝수면 false를 리턴해야 한다.)
 */
public class Calculator {
	int value;
	
	Calculator() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isOdd(int num) {
		return(num%2==1) ;
			
		}
	}


