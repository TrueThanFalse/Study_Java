package Day08;

public class Ex01 {

	public static void main(String[] args) {
		int a[] = {100, 200};
		int b = 200;
		add(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		b = add2(b); // 변경이 필요
		System.out.println(b);
		
	}
	public static void add(int a[]) {
		a[a.length-1] = 300;
	}
	public static int add2(int b) {
		return (b=500);
		// 객체는 힙 영역의 실제 값이 변하면(메서드에서 값을 변환 시키면) 리턴 하지 않더라도 스택 영역의 주소는 동일하므로 변환된 힙 영역 값이 적용 된다.
		// 지역변수는 리턴을 해야지만 실제 값이 변한다
	}
	

}
