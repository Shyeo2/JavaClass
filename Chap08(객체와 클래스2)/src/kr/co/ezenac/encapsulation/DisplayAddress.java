package kr.co.ezenac.encapsulation;
/*
 * 단계별로 생성해서 원하는 결과물을 얻는 생성.
 * 메서드의 조합으로 결과물을 생성.
 * 
 */

public class DisplayAddress {
	// StringBuffer
	// 문자열을 임시적으로 저장하는 메모리 공간
	StringBuffer buffer = new StringBuffer();
	private String line = "=========================================\n";
	private String title = " 이름\t   주소\t\t   전화번호    \n";

	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}

	private void makeBody() {
		buffer.append("이순신 \t");
		buffer.append("서울 강남구 \t");
		buffer.append("010-3232-5577\n");

		buffer.append("신사임당 \t");
		buffer.append("서울 서초구 \t");
		buffer.append("010-3231-7712\n");

	}

	private void makeFooter() {
		buffer.append(line);
	}

	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();
	}
}
