package Day09;

public class _04_ClassEx01 {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.print();
		// p.x=1; // 멤버변수 private로 변경을 금지 시켰음
		// p.y=3; // 멤버변수 private로 변경을 금지 시켰음
		p.setX(1);
		p.SetY(3);
		p.print();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		p.setX(10);
		p.print();
		
		System.out.println("-----------");
		Point p2 = new Point();
		p2.setX(100);
		p2.SetY(200);
		p2.print();
		System.out.println(p2);
		
		System.out.println("-----------");
		Point2 p3 = new Point2();
		p3.print();
		p3.setX(3);
		p3.setY(5);
		p3.setZ(8);
		p3.print();
		System.out.println(p3.getX());
		p3.setX(9);
		System.out.println(p3.getX());
		
		

	}

}


// (0,0)
class Point{ // Day08과 패키지가 달라서 class Point 생성 가능
	// 멤버변수 자리
	// 멤버변수는 자동으로 초기화 된다.
	// 멤버변수는 일반적으로 private 사용
	private int x; // 멤버변수 자동 초기화 : 0
	private int y; // 멤버변수 자동 초기화 : 0
	
	// print
	// 같은 클래스의 멤버변수는 모든 메서드에서 공유 됨
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	// getter(멤버변수의 값을 가져오는 기능의 메서드)
	// setter(멤버변수의 값을 변경하는 기능의 메서드)
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) { // 매개변수 x와 멤버변수 x는 다르다
		// this : 내 클래스의 멤버변수를 지칭하는 키워드
		this.x = x;
	}
	public void SetY(int y) {
		this.y = y;
	}
}

/* Point2 클래스 생성
 * (0,0,0)
 * x,y,z 멤버변수
 * print 메서드 생성
 * getter / setter 메서드 생성
 */

class Point2{
	private int x;
	private int y;
	private int z;
	
	public void print() {
		System.out.println("("+x+","+y+","+z+")");
	}

	// 자동으로 생성한 getter와 setter // 쉬프트+컨트롤+s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
//	public int getX() {
//		return x;
//	}
//	public int getY() {
//		return y;
//	}
//	public int getZ() {
//		return z;
//	}
//	
//	public void setX(int x) {
//		this.x = x;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	public void setZ(int z) {
//		this.z = z;
//	}
	
	
	
}
