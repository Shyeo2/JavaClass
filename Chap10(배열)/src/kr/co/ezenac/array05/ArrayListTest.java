package kr.co.ezenac.array05;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {

		ArrayList<Book> libray = new ArrayList<>();
		
		libray.add(new Book("혼자 공부하는 컴퓨터 구조 + 운영체제", "강민철"));
		libray.add(new Book("혼공2", "강민철2"));
		libray.add(new Book("혼공3", "강민철3"));
		libray.add(new Book("혼공4", "강민철4"));
		libray.add(new Book("혼공5", "강민철5"));
		
		for (int i = 0; i < libray.size(); i++) {
			libray.get(i).showInfo();
			
		}
	}
}
