package kr.co.ezenac.membership02;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customerL = new Customer(2022, "최선혜");
		customerL.bonusPoint = 1000;

		int priceL = customerL.calcPrice(10000);
		System.out.println(customerL.showInfo() + "지불금액은" + priceL + "원 입니다.");
		
		System.out.println();

		Customer customerS = new VIPCustomer(2023, "최선혜");
		customerS.bonusPoint = 1000;
		int priceS = customerS.calcPrice(10000);
		System.out.println(customerS.showInfo() + " 지불금액은 " + priceS + "원 입니다.");
	}

}
