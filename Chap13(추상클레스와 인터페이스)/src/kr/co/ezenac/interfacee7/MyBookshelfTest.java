package kr.co.ezenac.interfacee7;

public class MyBookshelfTest {

	public static void main(String[] args) {
		
		Queue bQueue = new MyBookshelf();
		bQueue.enQueue("배포 자동화와 지속적 인도");
		bQueue.enQueue("소프트웨어 아키텍처 이론과 실제");
		bQueue.enQueue("CERT C 프로그래밍");
		bQueue.enQueue("자바의 정석");

		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		
	}

}
