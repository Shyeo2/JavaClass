package string;

public class StringBuilder01 {
	
	public static void main(String[] args) {
		
		StringBuilder buf = new StringBuilder("동해물과");
		
		buf.append("백두산이");
		System.out.println(buf.toString()); //형변환 후 출력 
		
		buf.append(12345);		//추가
		System.out.println(buf.toString()); 
		
		buf.delete(0, 4);		//구간 삭제
		System.out.println(buf.toString());
		
		buf.replace(4, 8, "ABC"); //값 변경
		System.out.println(buf.toString());
		
		buf.reverse();	//순서 반전
		System.out.println(buf.toString());
	}
}
