package Day15_CustomerSolution;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		Customer[] customerList = new Customer[10];

		Customer cLee = new Customer(1001, "유재석");
		Customer cHong = new CustomerGold(1002, "홍길동");
		Customer cKim = new CustomerVIP(1003, "김철수", 1111);
		Customer cHan = new CustomerVIP(1004, "한민철", 2222);
		Customer cKan = new CustomerGold(1005, "칸");
		Customer cRan = new Customer(1006, "란");
		
		int cnt = 0;
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = cHong;
		cnt++;
		customerList[cnt] = cKim;
		cnt++;
		customerList[cnt] = cHan;
		cnt++;
		customerList[cnt] = cKan;
		cnt++;
		customerList[cnt] = cRan;
		cnt++;
		
		/* 다운캐스팅
		* 다운캐스팅을 하는 이유 : 부모의 공유되는 멤버변수나 메서드가 아닌
		* 자식의 고유멤버변수나 메서드를 호출하고자 할때 필요
		* 다운캐스팅은 반드시 명시적으로 형변환 해야 함
		* instanceof 연산자를 통해서 원래 그 형태가 맞는지 체크하는 키워드 true/false
		*/
	
//		int price = cLee.calcPrice(10000);
//		System.out.println("지불 금액:"+price);
//		cLee.customerInfo();
		
		// for문을 활용한 고객 정보 출력
		System.out.println("<<<<< 고객 정보 출력 >>>>>");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println("--------------------");
		}
		
		System.out.println();
		
		System.out.println("<<<<< 할인율과 포인트 계산 >>>>>");
		int pirce = 100000;
		// 홍길동님이 지불하실 금액은 *원 입니다. / 보너스 포인트는 *원 입니다.
			for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불 하실 금액은"+customerList[i].calcPrice(pirce)+" / 보너스 포인트는 "+customerList[i].getBonusPoint()+"입니다");
		}
		
		System.out.println("--------------------");
		
		// VIP 상담원이 해고가 되어서 다른 상담원으로 바꿔야 하는 상황 일 때
		for(int i=0; i<cnt; i++) {
		Customer tmp = customerList[i]; // 객체를 생성한 것이 아니고 주소만 복사된 것
			if(tmp instanceof CustomerVIP) {
				CustomerVIP vip = (CustomerVIP)tmp; // 다운캐스팅 형변환
				if(vip.getAgentID() == 1111) {
					vip.setAgentID(3333);
					vip.customerInfo();
				}
			}else {
				System.out.println("Casting Error");
			}
			
		}

	}
}
