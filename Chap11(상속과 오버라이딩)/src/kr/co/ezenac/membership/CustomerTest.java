package kr.co.ezenac.membership;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerL = new Customer(20220831, "이순신");
		customerL.setCustomerName("이순신");
		customerL.setCustomerId(20220831);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		System.out.println();
		
		VIPCustomer customerS = new VIPCustomer();
		customerS.setCustomerName("최선혜");
		customerS.setCustomerId(20220901);
		customerS.bonusPoint= 10000;
		System.out.println(customerS.showInfo());
	}

}
