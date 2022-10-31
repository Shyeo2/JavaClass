package kr.co.ezenac.membership;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;

//	public VIPCustomer() {
//		super(1000, "SILVER");
//		this.customerGrade = "VIP";
//		this.bonusRatio = 0.05;
//		salesRatio = 0.1;
//
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
//	
	public VIPCustomer(int coustomerId, String customerName, int agentId) {
		super(coustomerId, customerName);
		
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = agentId;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	
	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price * salesRatio);
	}
	@Override
	public String showInfo() {
		return super.showInfo()+" 담당 상담원 번호는 " + agentId + "입니다.";
	}
}
