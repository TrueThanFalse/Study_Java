package Day19Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	// Menu 클래스의 타입을 객체 선언시 기입하면 Generic 변수를 대체하여 타입이 결정 됨
	private ArrayList<Menu<String,Integer>> product = new ArrayList<Menu<String,Integer>>(); 
	private ArrayList<Menu<String,String>> order = new ArrayList<Menu<String,String>>();
	private int totalsum;
	
	// Solution
	
	public SaleManager() {
		addMenu2();
	}
	
	public void addMenu2() {
		product.add(new Menu("햄버거", 7000));
		product.add(new Menu("피자", 15000));
		product.add(new Menu("음료", 2000));
		product.add(new Menu("과자", 1000));
		product.add(new Menu("사탕", 500));
	}
	
	// 메뉴 추가
	public void add(Scanner scan) {
		System.out.println("메뉴명>");
		String menu = scan.next();
		System.out.println("가격>");
		int price = scan.nextInt();
		
		Menu m = new Menu(menu, price);
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
			Menu m = new Menu(tmpMenu, count); // 메뉴와 개수
			order.add(m);
			int tmpPrice = product.get(pick-1).getPrice();
			totalsum += (tmpPrice * count);
		}
	}
	
	// 주문 리스트
	public void printOrder2() {
		int sum = 0;
		int index = 1;
		for(Menu m : order) {
			String menu = (String)m.getName();
			int price = findMenu(menu);
			System.out.println(index+". "+m+" "+m.getPrice()+" "+((int)m.getPrice()*price));
		}
		System.out.println("----------");
		System.out.println("주문 총액: "+totalsum);
	}
	
	public int findMenu(String menu) {
		for(Menu<String,Integer> m : product) {
			if(m.getName().equals(menu)) {
				return m.getPrice();
			}
		}
		return -1;
	}
	
}

