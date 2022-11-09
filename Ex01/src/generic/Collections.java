package generic;

import java.io.BufferedWriter;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {

	static void printList(LinkedList<String> l) { // 리스트의 요소를 모두 출력하는 메소드 LinkedList<String> l

		Iterator<String> iterator = l.iterator(); // Iteractor 객체 리턴
		while (iterator.hasNext()) { // Iteractor 객체에 요소가 있을 때까지 반복
			String e = iterator.next(); // 다음 요소 리턴
			String separator;
			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}

	}

}
