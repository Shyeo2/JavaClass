package study;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
// 배열의 총합과 평균
//		int sum = 0;
//
//		int[] arr = { 100, 50, 90, 80, 70 };
//
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + (float) (sum / arr.length));

// 배열 최댓값 최솟값
//		int[] score = {50,60,80,77,95,78};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i =0; i<score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];
//			}else if (score[i] < min) {
//				min = score[i];
//			}
//		}
//			System.out.println("최대값 : " + max);
//			System.out.println("최소값 : " + min);
//			
		/*
		 * 길이가 10인 배열 numArr을 생성하고 0~9의 숫자로 차례대로 초기화하여 
		 * 출력 random()을 이용해서 배열의 임의의 위치에 있는
		 * 값과 배열의 첫 번째 요소 'numArr(0)'의 값을 교환하는 일을 100번 반복해서 배열의 요소가 섞이게 한다
		 */
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[num];
			numArr[num] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
