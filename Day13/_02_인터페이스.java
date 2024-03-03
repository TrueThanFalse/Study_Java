package Day13;

public class _02_인터페이스 {

	public static void main(String[] args) {

		/* 인터페이스 : 추상메서드와 상수로만 구성된 클래스
		 * 클래스가 아닌 인터페이스로 만들 수 있다.
		 * 추상메서드 : 선언부만 있고, 구현은 없는 메서드
		 * 
		 */
		
		
	}

}

interface Power{
	abstract void turnOn();
	abstract void turnoff();
}

interface Remocon{
	void chUP(); // 인터페이스는 자체로 추상이므로 abstract를 생략할 수 있다
	void chDown();
}

class TV implements Power,Remocon{ // 다중 구현
	
	private int ch;
	private boolean power;

	@Override
	public void chUP() {
		// TODO Auto-generated method stub
		ch++;
		if(ch > 100) {
			ch = 0;
		}
		
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		ch--;
		if(ch < 0) {
			ch = 100;
		}
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		power = true;
		
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		power = false;
	} 

	
	
	
}
