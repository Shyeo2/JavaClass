package string;

public class Substring {

	public static void main(String[] args) {
		String str1 = "AppleBananaOrange";
		int num1 = str1.indexOf("Banana"); //"Banana시작 위치 반환"
		int num2 = str1.indexOf("Orange"); //"Orange시작 위치 반환"
		
		String str2 = str1.substring(num1, num2); //구간 위치 반환
		System.out.println(str2);
		
		String str3 = str1.substring(num2); //특정위치 위후 반환
		System.out.println(str3);
	}

}
