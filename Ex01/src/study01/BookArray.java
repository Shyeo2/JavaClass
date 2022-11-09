package study01;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book[] book = new Book[2];
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String title = scan.nextLine();
			System.out.print("저자>>");
			String author = scan.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title +"," + book[i].author +")");
		}
		scan.close();
	}

}
