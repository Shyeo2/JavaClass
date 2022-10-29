package kr.co.ezenac.loop;

//누적합계가 2000이상(조건)일때 i의 값을 출력하시오.

public class ForTest02 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum >= 2000) {

				System.out.println(i);
				System.out.println(sum);

				break;
			}
		}

		int sum1 = 0;
		int tmp = 0;

		for (int j = 1; j <= 100; j++) {
			sum1 += j;
			if (sum1 >= 2000) {
				tmp = j;
				break;

			}
		}
		System.out.println(tmp);
		System.out.println(sum1);
	}

}
