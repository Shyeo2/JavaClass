package kr.co.ezenac.array02;

public class StringArray {

	public static void main(String[] args) {
		String[] name = new String[7];

		name[0] = new String("이순신");
		name[1] = new String("이순신2");
		name[2] = new String("메롱1");
		name[3] = new String("메롱2");
		name[4] = new String("메롱3");
		name[5] = new String("메롱4");
		name[6] = new String("메롱5");

		int cnum =0;
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			cnum += name[i].length();
		}
		System.out.println("총 문자의 수 : " + cnum);
	}

}
