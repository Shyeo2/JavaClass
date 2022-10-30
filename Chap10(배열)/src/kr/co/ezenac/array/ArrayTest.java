package kr.co.ezenac.array;

class Box{
	
}
public class ArrayTest {

	public static void main(String[] args) {

		// 길이가 5인 int형 1차원 배열 생성
		int[] arr1 = new int[5];

		// 배열 생성 및 초기화 (방법1)
		// 개수 생략해야 함
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 }; // 뒤에 초기화하는 데이터 개수를 보고 생략된 숫자 유추함

		// 배열 생성 및 초기화 (방법2)
		int[] arr3 = { 1, 2, 3, 4, 5 }; // 뒤에 초기화하는 데이터를 보고 당연히 배열의 초기화 값이라고 유추함

		// 배열 선언 후 배열을 생성하는 경우
		int[] arr4;
		arr4 = new int[6];

		// 길이가 7일 double형 1차원 배열 생성하시오.
		double[] arr5 = new double[7];
		
		// 길이가 9일 float형 1차원 배열 생성하시오.
		// 배열의 참조 변수와 객체 생성 분리
		float[] arr6;
		arr6 = new float[9];
		
		// 객체 대상 1차원 배열
		Box[]arr7 = new Box[5];
		
		// 배열의 객체 변수 (length) 사용
		System.out.println("배열 arr1 길이 : " + arr1.length);
		System.out.println("배열 arr2 길이 : " + arr2.length);
		System.out.println("배열 arr3 길이 : " + arr3.length);
		System.out.println("배열 arr4 길이 : " + arr4.length);
		System.out.println("배열 arr5 길이 : " + arr5.length);
		System.out.println("배열 arr6 길이 : " + arr6.length);
		System.out.println("배열 arr7 길이 : " + arr7.length);
		
	}

}
