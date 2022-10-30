package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] libray = new Book[5];
		Book[] copyLibray = new Book[5];

		libray[0] = new Book("자바의 정석", "남궁성");
		libray[1] = new Book("혼자 공부하는 컴퓨터 구조 + 운영체제", "강민철");
		libray[2] = new Book("혼자 공부하는 컴퓨터 구조2 + 운영체제", "강민철2");
		libray[3] = new Book("혼자 공부하는 컴퓨터 구조3 + 운영체제", "강민철3");
		libray[4] = new Book("혼자 공부하는 컴퓨터 구조4 + 운영체제", "강민철4");

		copyLibray[0] = new Book();
		copyLibray[1] = new Book();
		copyLibray[2] = new Book();
		copyLibray[3] = new Book();
		copyLibray[4] = new Book();

		for (int i = 0; i < libray.length; i++) {
			copyLibray[i].setTitle(libray[i].getTitle());
			copyLibray[i].setAuthor(libray[i].getAuthor());

		}

		// for(Book book : copyLibray)
		// book.showInfo();

		libray[0].setTitle("구글 엔지니어는 이렇게 일한다");
		libray[0].setAuthor("타이터스 원터스");

		System.out.println();

		for (Book book : libray) {
			book.showInfo();

			System.out.println();

			for (Book book2 : copyLibray) {
				book2.showInfo();
			}

		}

	}
}