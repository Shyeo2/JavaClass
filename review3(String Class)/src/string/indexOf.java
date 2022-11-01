package string;

public class indexOf {

	public static void main(String[] args) {
		String str = "AppleBananaOrange";
		int num1 = str.indexOf("a");
		int num2 = str.indexOf("a", num1+1);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
