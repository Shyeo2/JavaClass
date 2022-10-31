package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.salesRatio = 0.1;
				
	}
	 @Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

}
