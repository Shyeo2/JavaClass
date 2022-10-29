package kr.co.ezenac.loop04;

public class WhileTest02 {

	public static void main(String[] args) {
		//1~100사이의 5와 7의 배수를 출력하고 해당 개수도 출력(5와 7의 공배수)
		
		int num = 0;
		int count = 0;  //개수 초기화
		
		while((num++) < 100) {
//			if(((num % 5 )!=0 )|| ((num % 7)!=0))
//				continue;    //5와 7의 배수가 아니면 위로 이동
				
			if((num % 5)!= 0)
				continue;
			if((num % 7)!= 0)
				continue;
			count++;		// 5와 7의 배수이면 실행
			System.out.println(num);
			}
			System.out.println("count : " + count);
		
			}
		}
	


