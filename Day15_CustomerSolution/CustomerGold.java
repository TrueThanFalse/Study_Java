package Day15_CustomerSolution;

public class CustomerGold extends Customer{

	// 멤버변수: 할인율
	private double saleRatio;
	
	public CustomerGold() {}
	public CustomerGold(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// 메서드 중 할인 금액을 리턴할 수 있도록 calcPrice 메서드를 오버라이딩.
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		price = price - (int)(price * bonusRatio);
		return price;
	}
	
	// getter,setter
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	
	
}
