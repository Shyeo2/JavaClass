package kr.co.ezenac.variable03;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1); //encoding 되고 decoding 됨
		System.out.println((int)ch1); 
	
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println((char)ch3);	
		
		//char ch4 = -66; //음수는 대입 불가능
		
		char ch5 = '한';
	
	}
}
