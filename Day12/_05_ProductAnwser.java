package Day12;

public class _05_ProductAnwser {

	private String name;
	private int price;
	
	public _05_ProductAnwser() {}
	public _05_ProductAnwser(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
	}
	
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
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
	@Override
	public String toString() {
		return "[메뉴:" + name + ", 가격:" + price + "]";
	}
	
	
	
}
