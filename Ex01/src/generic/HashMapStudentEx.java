package generic;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) {
		//(학생이름, Student 객체)를 저장하는 해시맵 생성
		HashMap<String, Student> map = new HashMap<String ,Student>();
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-222-2222"));
		map.put("김남윤", new Student(3,"010-333-3333"));

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = scan.nextLine();
			if(name.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			Student student = map.get(name);
			if(student == null) {
				System.out.println(name + "은 없는 사람입니다.");
			}
			else {
				System.out.println("id: " + student.getId() + ", 전화:" + student.getTel());
			}
				
		}
		scan.close();
	}

}
