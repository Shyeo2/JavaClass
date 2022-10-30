package kr.co.ezenac.array02;

import java.util.Arrays;

public class ArrayTetst {

	public static void main(String[] args) {

		int[] score = null; // score 참조변수임.
		// score = {100,200}; //배열 생성이 안되어 있는데 값을 대입하고 있음.

		score = new int[5];
		// 배열명이 곧 주소임.
		System.out.println("score의 주소값 : " + score);

		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]=" + score[i]);
		}
		System.out.println();

		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			// 범위 1~10까지의 난수를 대입
			arr1[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (i != arr1.length - 1) {
				System.out.print(arr1[i] + ", ");
			} else {
				System.out.println(arr1[i]);
			}
		}
		System.out.println();

		System.out.println(Arrays.toString(arr1));
	}

}
