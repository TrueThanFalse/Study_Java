package Day15;

public class _03_CustomerMain {

	public static void main(String[] args) {
		
		_03_Customer silber = new _03_Customer();
		
		_03_CustomerGold gold = new _03_CustomerGold();
		
		_03_CustomerVIP vip = new _03_CustomerVIP();
		
		silber.setCustomerID(21);
		silber.setCustomerName("김종국");
		System.out.println("구매 가격:" + silber.calcPrice(10000));
		silber.customerInfo();
		System.out.println("구매 가격:" + silber.calcPrice(20000));
		silber.customerInfo();
		System.out.println("구매 가격:" + silber.calcPrice(35000));
		silber.customerInfo();
		
		System.out.println("---------------");
		
		gold.setCustomerID(67);
		gold.setCustomerName("송지효");
		System.out.println("구매 가격:" + gold.calcPrice(10000));
		gold.customerInfo();
		System.out.println("구매 가격:" + gold.calcPrice(20000));
		gold.customerInfo();
		System.out.println("구매 가격:" + gold.calcPrice(35000));
		gold.customerInfo();
		
		System.out.println("---------------");
		
		vip.setAgentID(7777);
		vip.setCustomerID(100);
		vip.setCustomerName("유재석");
		System.out.println("구매 가격:" + vip.calcPrice(10000));
		vip.customerInfo();
		System.out.println("구매 가격:" + vip.calcPrice(20000));
		vip.customerInfo();
		System.out.println("구매 가격:" + vip.calcPrice(35000));
		vip.customerInfo();

	}

}
