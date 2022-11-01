package string;

import java.util.StringTokenizer;

public class StringToke {

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("a b c");  	//문자열을 공백기준으로 나눔
		StringTokenizer st2 = new StringTokenizer("1,2,3", ",");//문자열을 토큰으로 나누기위한 구분자 지정
		
		while (st1.hasMoreTokens()) { 			//나누어진 토큰이 있는지 확인
			System.out.println(st1.nextToken());//토큰이 있다면 nextToken()으로 받아옴 
			
		}
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
			
		}

	}

}
