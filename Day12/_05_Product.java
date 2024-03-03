package Day12;

public class _05_Product {

	/* 1. 메뉴이름, 가격을 클래스 작성
	 * 2. 메뉴 추가 메서드
	 * 3. 제품 리스트 출력 메서드
	 */
	
	private String name;
	private int price;
	
	public _05_Product() {}
	public _05_Product(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
	}
	
	public void addProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println("상품명: "+name+", 가격: "+price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}

