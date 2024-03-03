package Day15;

public class _03_CustomerVIP extends _03_Customer{

	private int agentID;
	
	public _03_CustomerVIP() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.8;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("전담 상담사 번호는 "+agentID+"입니다.");
	}

	@Override
	public int getCustomerID() {
		// TODO Auto-generated method stub
		return super.getCustomerID();
	}

	@Override
	public void setCustomerID(int customerID) {
		// TODO Auto-generated method stub
		super.setCustomerID(customerID);
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return super.getCustomerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		super.setCustomerName(customerName);
	}

	@Override
	public String getCustomerGrade() {
		// TODO Auto-generated method stub
		return super.getCustomerGrade();
	}

	@Override
	public int getBonusPoint() {
		// TODO Auto-generated method stub
		return super.getBonusPoint();
	}

	@Override
	public double getBonusRatio() {
		// TODO Auto-generated method stub
		return super.getBonusRatio();
	}

	@Override
	public double getSaleRatio() {
		// TODO Auto-generated method stub
		return super.getSaleRatio();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
