package Day15_CustomerSolution;

public class CustomerVIP extends Customer{

	private double saleRatio;
	private int agentID;
	
	public CustomerVIP() {}
	public CustomerVIP(int id, String name, int agentID) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	// 메서드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		price = price - (int)(price * bonusRatio);
		return price;
	}
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당 상담원 번호는"+agentID+"입니다.");
	}
	
	// get,set
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	

}
