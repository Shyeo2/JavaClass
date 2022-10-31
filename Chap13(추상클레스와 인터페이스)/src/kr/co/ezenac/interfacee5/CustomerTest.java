package kr.co.ezenac.interfacee5;

public class CustomerTest {
	public static void main(String[] args) {
		
	Customer customer = new Customer();
	customer.buy();
	customer.sell();
	customer.sayWorld();
	customer.order();
	
	
	Buy buyer = customer;
	buyer.buy();
	
	Sell seller = customer;
	seller.sell();
	
	buyer.order();
	seller.order();
	
	}
}
