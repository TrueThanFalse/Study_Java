package Day10;

public class _01_Class02 {

	public static void main(String[] args) {
		
		/* 자동차 클래스 생성
		 * 멤버변수 : 이름, 규격, 색상, 전원, 속도
		 * 메서드 : 전원, 속도 up, 속도 down 
		 */

		Car c = new Car("싼타페", "중형SUV", "노랑");
		c.power();
		c.setSpeed(199);
		c.speedUp();
		c.print();
		
		
	}

}

/* 클래스 구성 순서
 * 멤버변수 선언
 * 생성자
 * 메서드
 * getter & setter
 */
class Car{
	// 멤버변수 선언
	private String name;
	private String size;
	private boolean power = false;
	private int speed = 0;
	private String color;
	
	
	// 생성자
	public Car() {} // 기본 생성자
	public Car(String name, String size, String color) {
		this.name = name;
		this.size = size;
		this.color = color;
	}
	
	// 메서드
	public void print() {
		System.out.println("자동차명: "+name);
		System.out.println("규격: "+size);
		System.out.println("색상: "+color);
		if(power==true) {
			System.out.println("전원 상태: On");
		}else {
			System.out.println("전원 상태: Off");
		}
		System.out.println("현재 속도: "+speed);
	}
	
	public boolean power() {
		if(speed>30 || speed<-10) {
			return power;
		}else {
		power = !power;
		}
		return power;
	}
	
	public void powerOn() {
		power = true;
		System.out.println("시동이 켜졌습니다");
	}
	
	public void powerOff() {
		if(speed>30) {
			System.out.println("속도를 먼저 줄여주세요");
		}else if(speed==0) {
			power = false;
			System.out.println("시동이 꺼졌습니다");	
		}
	}
	
	public void speedUp() {
		if(power==false) {
			System.out.println("시동을 켜주세요");
		}else if(speed>=0 && speed<=200) {
			speed++;
		}
		System.out.println("현재 속도: "+speed);
	}
	
	public void speedDown() {
		if(power==false) {
			System.out.println("시동을 켜주세요");
		}else if(speed<=0 && speed>=-30) {
			speed--;
		}
		System.out.println("현재 속도: "+speed);
	}
	
	public void speedUp(int num) {
		if(power==false) {
			System.out.println("시동을 켜주세요");
		}else if(speed>=0 && speed<=200) {
			speed += num;
		}
		if(speed>200) {
			speed = 200;
		}
		System.out.println("현재 속도: "+speed);
	}
	
	public void speedDown(int num) {
		if(power==false) {
			System.out.println("시동을 켜주세요");
		}else if(speed<=0 && speed>=-30) {
			speed -= num;
		}
		if(speed<-30) {
			speed = -30;
		}
		System.out.println("현재 속도: "+speed);
	}
	
	// getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}