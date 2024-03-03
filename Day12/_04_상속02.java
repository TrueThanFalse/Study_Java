package Day12;

public class _04_상속02 {

	public static void main(String[] args) {
		
		/* 오버라이딩 : 부모 클래스에서 물려받은 메서드를 '재정의' 하는 것
		 * - 부모클래스의 메서드와 선언부가 같아야 일치 해야 함
		 * 접근제한자는 같거나 더 넓은 범위 접근제한자를 써야 함 => 범위 축소는 불가능
		 * - @Override : 어노테이션 => Java 프로그램이 더 쉽고 빨리 읽을 수 있음
		 */
		
		Dog d = new Dog();
		d.setName("테라");
		d.info();
		d.howl();
		
		System.out.println("-----");
		
		Cat c = new Cat("미미","고양이");
		c.info();
		c.howl();
		c.setName("루루");
		c.info();
		c.howl();
		
		Tiger t = new Tiger("어흥이","고양이과");
		t.info();
		t.howl();
		
		

	}

}

class Tiger extends Animal{
	
	public Tiger(String name, String category) {
		// 부모의 생성자를 호출
		super(name, category);
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥!");
	}
	
}


class Cat extends Animal{
	public Cat(String name, String categoty) {
		super.setName(name);
		super.setCategory(categoty);
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹~!");
	}

}



class Dog extends Animal{
	public Dog() {
		setName("강아지"); // 부모의 멤버변수 name에 "강아지"를 저장
		setCategory("개과");
				
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍~!");
	}
	
}


class Animal{
	private String name;
	private String category; // 종
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	// 정보 출력
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("종: "+category);
	}
	
	// 울음소리
	public void howl() {
		System.out.println("=="+name+"의 울음 소리==");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}