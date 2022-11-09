package string;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");		// 문자열 덧붙이기
		System.out.println(sb);
		
		sb.insert(7, " my");			// 문자열 삽입
		System.out.println(sb);

		sb.replace(8, 10, "your");		// my >> your로 변경
		System.out.println(sb);
		
		sb.delete(8, 13);				// your 삭제
		System.out.println(sb);
		
		sb.setLength(4);				// 스트링 버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}

}
