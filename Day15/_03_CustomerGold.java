package Day15;

public class _03_CustomerGold extends _03_Customer{
	
	public _03_CustomerGold() {
		super();
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.9;
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
	
}
