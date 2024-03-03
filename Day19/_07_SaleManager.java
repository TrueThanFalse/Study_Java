package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class _07_SaleManager {

	// menu 클래스를 리스트로 구현
	
	// 메뉴리스트, 주문리스트로 구현
	
	// 메뉴 추가, 메뉴 생성, 주문 처리
	
	private ArrayList<_06_Menu> menuList = new ArrayList<_06_Menu>();
	private ArrayList<_06_Menu> orderList = new ArrayList<_06_Menu>();
	private int totalsum=0;
	
//	메인 메뉴 출력과 처리
//	1. 메뉴 추가
//	2. 메뉴 출력
//	3. 주문
//	4. 주문리스트
//	5. 종료
	
	public void addMenu(Scanner scan) {
		System.out.println("메뉴명 >");
		String name = scan.next();
		System.out.println("가격 >");
		int price = scan.nextInt();
		_06_Menu menu = new _06_Menu(name, price);
		menuList.add(menu);
	}
	
	public void printMenu() {
		for(int i=0; i<menuList.size(); i++) {
			System.out.println((i+1)+". "+menuList.get(i).getName()+"("+menuList.get(i).getPrice()+")");
		}
	}
	
	public void order(Scanner scan) {
		System.out.println("<<< Menu List >>>");
		printMenu();
		int cnt = 0;
		int choice = -1;
		while(choice != 0) {
		System.out.println("주문하실 Menu를 선택하세요. (주문 종료=0)");
		choice = scan.nextInt();
		if(choice == 0) {
			return;
		}
		System.out.println("수량 >");
		cnt = scan.nextInt();
		_06_Menu order = new _06_Menu(menuList.get(choice-1).getName(), menuList.get(choice-1).getPrice());
		orderList.add(order);
		orderList.get(choice-1).setCnt(cnt);
		}
	}
	
	public void printOrder() {
		for(int i=0; i<orderList.size(); i++) {
			System.out.println((i+1)+". "+menuList.get(i).getName()+"("+menuList.get(i).getPrice()+")");
		}
	}
	

	
	
	// Solution
	
	private ArrayList<_06_Menu> product = new ArrayList<_06_Menu>();
	private ArrayList<_06_Menu> order = new ArrayList<_06_Menu>();
	
	public _07_SaleManager() {
		addMenu2();
	}
	
	public void addMenu2() {
		product.add(new _06_Menu("햄버거", 7000));
		product.add(new _06_Menu("피자", 15000));
		product.add(new _06_Menu("음료", 2000));
		product.add(new _06_Menu("과자", 1000));
		product.add(new _06_Menu("사탕", 500));
	}
	
	// 메뉴 추가
	public void add(Scanner scan) {
		System.out.println("메뉴명>");
		String menu = scan.next();
		System.out.println("가격>");
		int price = scan.nextInt();
		
		_06_Menu m = new _06_Menu(menu, price);
		product.add(m);
		System.out.println("메뉴 추가 완료");
	}
	
	// 메뉴 리스트
	
	public void printProduct() {
		System.out.println("---menu---");
		for(int i=0; i<product.size(); i++) {
			System.out.println((i+1)+". "+product.get(i));
		}
		System.out.println("----------");
	}
	
	// 주문 처리
	public void orderPick(Scanner scan) {
		System.out.println("주문메뉴: ");
		//1. 메뉴를 직접 한글로 받는 케이스
//		String menu = scan.next();
		//2. 메뉴를 숫자로 받는 케이스
		int pick = scan.nextInt(); // index-1
		String tmpMenu = product.get(pick-1).getName();
		
		if(tmpMenu == null) {
			System.out.println("찾는 메뉴가 없습니다.");
			return;
		}else {
			System.out.println("주문 수량:");
			int count = scan.nextInt();
			_06_Menu m = new _06_Menu(tmpMenu, count); // 메뉴와 개수
			order.add(m);
			int tmpPrice = product.get(pick-1).getPrice();
			totalsum += (tmpPrice * count);
		}
	}
	
	// 주문 리스트
	public void printOrder2() {
		int sum = 0;
		int index = 1;
		for(_06_Menu m : order) {
			String menu = m.getName();
			int price = findMenu(menu);
			System.out.println(index+". "+m+" "+m.getPrice()+" "+(m.getPrice()*price));
		}
		System.out.println("----------");
		System.out.println("주문 총액: "+totalsum);
	}
	
	public int findMenu(String menu) {
		for(_06_Menu m : product) {
			if(m.getName().equals(menu)) {
				return m.getPrice();
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
}
