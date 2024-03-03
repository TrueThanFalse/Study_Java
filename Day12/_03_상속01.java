package Day12;

public class _03_상속01 {

	public static void main(String[] args) {
		
		/* 상속 : 부모의 것을 자식에게 물려 주는 것
		 * 클래스 상속 : 부모 클래스의 멤버변수/멤버메서드를 물려주는 것
		 * 상속을 하는 이유 : 재사용을 해서 중복 코드를 줄이기 위한 것
		 * class A(부모 클래스) / class B(자식 클래스)
		 * 
		 * class B extends A{
		 * }
		 * 
		 * 상속 키워드 : extends
		 * 
		 * 상속을 받으면 부모의 멤버변수와 멤버메서드를 사용할 수 있다.
		 * 만약 부모의 접근제한자가 private면 자식 클래스에서도 접근 불가능
		 * 접근제한자 protected : 상속 받는 자식에게 허용하는 제어자
		 * 
		 * 
		 */
		
		A a = new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum(40);
		a.print();
		
		B b = new B();
		b.num = 70;
		b.setD(10);
		b.setE(20);
		b.setF(30);
		b.print();
		
		b.setA(100);
		System.out.println(b.getA());
		b.setB(200);
		b.setC(300);
		b.num = 500; // 제어자가 protected 이기 때문에 직접 접근이 가능 함.
		b.setD(10);
		b.setE(20);
		b.setF(30);
		b.print();

	}

}

class A{
	private int a, b, c; // 나만 사용 가능
	protected int num; // 상속 가능
	
	
	public void print() {
		System.out.println("a: "+a+"b: "+b+"c: "+c);
		System.out.println("num "+num);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}

class B extends A{
	/* a,b,c,num 모두 사용 가능
	 * a,b,c는 getter/setter 로 접근 가능
	 */
	
	private int d,e,f;
	
//	public void print() {
//		// super : 부모의 멤버를 가져올 때 사용하는 키워드
//		// this : 내 멤버를 가져올 때 사용하는 키워드
//		super.print(); // 부모의 pirnt() 메서드 호출
//		System.out.println("d: "+d+"e: "+e+"f: "+f);
//	}
	

	public int getD() {
		return d;
	}

	// 오버라이드 : 부모의 메서드를 가져와서 재정의 하는 것을 의미
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	
	
}