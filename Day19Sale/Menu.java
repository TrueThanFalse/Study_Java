package Day19Sale;

public class Menu<K,V> {

	// Generic(제네릭) : 결정되지 않은 파라미터를 처리
	// 실제 객체를 생성할 때 파라미터 타입을 결정해서 대체
	// <T> (변수가 1개 일때) / <K,V> (변수가 2개 일때 
	
	private K name;
	private V price;
	
	public Menu() {}
	public Menu(K menu, V price) {
		this.name = menu;
		this.price = price;
	}
	
	public K getName() {
		return name;
	}
	public void setName(K menu) {
		this.name = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Menu [menu=" + name + ", price=" + price + "]";
	}

	
	
}
