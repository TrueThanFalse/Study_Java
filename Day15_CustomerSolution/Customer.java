package Day15_CustomerSolution;

public class Customer {

	/* 고객 클래스
	 * 일반고객 / Gold고객 / VIP고객
	 * 
	 * 멤버 변수
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - customer 객체 생성시
	 * 기본 customerGrade = Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * - 메서드
	 * 	1. 보너스 적립 계산 메서드(메서드명: calcPrice(int price))
	 * 			=> 보너스를 적립 하고, 할인 여부 체크하여, 구매 금액 price 리턴
	 * 				구매금액을 주고, 적립보너스 계산, bonusPoint에 누적, 실 구매 금액 리턴
	 * 	2. 출력 메서드 (메서드명: customerInfo())
	 * 			=> 홍길동님의 등급은 VIP이며 보너스 포인트는 1000점 입니다. 출력
	 * 				전담 상담사 번호는 ****입니다. - VIP만 출력
	 * 
	 * - class 작성
	 * 	- Silver등급은 제품을 살때 할인 없음. / 보너스 포인트 1% 적립
	 * 	- Gold등급은 제품을 살때 10% 할인(sale) / 보너스 포인트 2% 적립
	 * 	- VIP등급은 제품을 살때 20% 할인 / 보너스 포인트 5% 적립 / 전담상담사(int agentID)를 갖는다.
	 */
	
	
	// 멤버변수 선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade; 
	protected int bonusPoint;
	protected double bonusRatio; 
	
	// 생성자
	public Customer() {}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	// 메서드
	// 가격을 매개변수로 받아 포인트 적립 / 가격을 리턴
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	// 고객 정보 출력 메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며 보너스 포인트는 "+bonusPoint+"입니다.");
	}
	// toString 형태로 리턴
//	public String customerInfo() {
//		return customerName+"님의 등급은 "+customerGrade+"이며 보너스 포인트는 "+bonusPoint+"입니다.";
//	}

	// getter,setter
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
	
	
	
	
	
	
	
}
		

