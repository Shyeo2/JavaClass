package study;

import java.util.Scanner;

public class programming {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("exit을 입력하면 종료합니다.");
		
			while(true) {
				System.out.print(">>");
				String text = scan.nextLine();
				if(text.equals("exit")) {
					break;
				}
			}System.out.println("종료합니다...");
			scan.close();
		}
	}
