package kr.co.ezenac.membership02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerL = new Customer(20220831, "이순신");
		// customerL.setCustomerName("이순신");
		// customerL.setCustomerId(20220831);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());

		System.out.println();

		VIPCustomer customerS = new VIPCustomer(20220901, "최선혜");
		// customerS.setCustomerName("최선혜");
		// customerS.setCustomerId(20220901);
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());

		System.out.println();

		Customer customerL2 = new VIPCustomer(20220902, "이방원");
		//customerL2는 Customer 클래스의 멤버변수와 메서드만 사용가능
		customerL2.bonusPoint = 10000;
		System.out.println(customerL2.showInfo());
	}

}
