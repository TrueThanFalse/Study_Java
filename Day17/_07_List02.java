package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_List02 {
	
	public static void main(String[] args) {
		
		/* --메뉴판--
		 * 1. 햄버거:7000
		 * 2. 피자:15000
		 * 3. 음료수:2000
		 * 4. 과자:1000
		 * 5. 사탕:500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴 선택 > 1
		 * 수량 > 2
		 * => 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴 선택 > 3
		 * 수량 > 2
		 * => 3번 음료수 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. > 0
		 * 
		 * --선택한 메뉴--
		 * 1. 햄버거 2개
		 * 2. 음료 2개 선택
		 * 총 지불금액 *원
		 */
		
		FoodManager fm = new FoodManager();
		Scanner scan = new Scanner(System.in);
		
		fm.printMenu();
		fm.printChoice(scan);
		fm.printCalcul();
		
	}

}

class FoodManager{
	// 멤버변수 ArrayList 메뉴, ArrayList 가격
	// 그 외 필요한 멤버 변수는 알아서
	
	private List<String> menu = new ArrayList<String>();
	private List<Integer> price = new ArrayList<Integer>();
	
	private List<Integer> choiceFood = new ArrayList<Integer>();
	private List<Integer> choiceQuantity = new ArrayList<Integer>();
	
	public FoodManager() {
		menu.add("1. 햄버거");
		menu.add("2. 피자");
		menu.add("3. 음료수");
		menu.add("4. 과자");
		menu.add("5. 사탕");
		price.add(7000);
		price.add(15000);
		price.add(2000);
		price.add(1000);
		price.add(500);
	}
	
	// 메서드
	// 출력 : 메뉴출력, 결과출력, 추가출력, 계산출력
	public void printMenu() {
		System.out.println("<<< 메뉴판 >>>");
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i)+": "+price.get(i)+"원");
		}
	}
	
	public void printChoice(Scanner scan) {
		int tmp = 1;
		while(tmp != 0) {
			System.out.println("<<< 주문 선택 >>>");
			System.out.println("구매할 식품의 번호를 입력 >");
			int foodNum = scan.nextInt();
			choiceFood.add(foodNum-1);
			System.out.println("구매 수량을 입력 >");
			int quantity = scan.nextInt();
			choiceQuantity.add(quantity);
			System.out.println(menu.get(foodNum-1)+", "+quantity+"개 주문");
			System.out.println("주문을 끝내시려면 0을 입력하세요. 더 주문하시려면 0을 제외한 숫자를 눌러주세요.");
			tmp = scan.nextInt();
		}
	}
	
	public void printCalcul() {
		System.out.println("<<< 주문 결과 >>>");
		for(int i=0; i<choiceFood.size(); i++) {
			System.out.println(menu.get(choiceFood.get(i)) + " " + choiceQuantity.get(i) + "개");
		}
		int sumPrice = 0;
		for(int i=0; i<choiceFood.size(); i++) {
			sumPrice += choiceQuantity.get(i) * price.get(i); 
		}
		System.out.println("총 지불 금액: " + sumPrice);
	}

	//getter,setter
	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}

	public List<Integer> getPrice() {
		return price;
	}

	public void setPrice(List<Integer> price) {
		this.price = price;
	}

	public List<Integer> getChoiceFood() {
		return choiceFood;
	}

	public void setChoiceFood(List<Integer> choiceFood) {
		this.choiceFood = choiceFood;
	}

	public List<Integer> getChoiceQuantity() {
		return choiceQuantity;
	}

	public void setChoiceQuantity(List<Integer> choiceQuantity) {
		this.choiceQuantity = choiceQuantity;
	}
	
	
	
}