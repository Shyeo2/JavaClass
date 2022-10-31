package kr.co.ezenac.membership;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202208, "최선혜");
		Customer customerS = new Customer(202209, "감망");
		Customer customerL2 = new GoldCustomer(202210, "이순신");
		Customer customerC = new GoldCustomer(202211, "최현호");
		Customer customerK = new VIPCustomer(202212, "감망꾸", 77777);
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerL2);
		customerList.add(customerC);
		customerList.add(customerK);
		
		System.out.println("============고객 정보 출력==============");
		for (Customer customer :customerList) {
			System.out.println(customer.showInfo());
		}
		System.out.println("============할인율 계산===============");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 " + cost + "원 지불하셨습니다.");
		}
		System.out.println("============보너스 포인트 계산===========");
		for (Customer customer : customerList) {
			customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 " + customer.getBonusPoint()+"점 입니다.");
		}
		
	}

}
