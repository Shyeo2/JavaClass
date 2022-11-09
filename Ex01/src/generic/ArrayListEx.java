package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<>();
		
		//키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String str = scan.nextLine();
			a.add(str);				//ArrayList 컬렉션에 삽입
		}
		
		// ArrayList에 들어있는 모든 이름 출력
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i); 	//ArrayList의 i번째 문자열 얻어오기
			System.out.print(name + " ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0;		//현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i = 1; i < a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은 :" + a.get(longestIndex));
		scan.close();
		
	}

}
