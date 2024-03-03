package Day15;

public class _02_다형성02 {

	public static void main(String[] args) {
		
//		Human h = new Human();
//		h.eating();	
//		h.move();
		
		// 부모 클래스를 이용하여 자식 클래스 생성
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		Tiger t = new Animal(); // 자식 클래스로부터 부모클래스를 생성하는 것은 불가능
		
		
		_02_다형성02 test = new _02_다형성02();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		System.out.println("-----");
		
		//Tiger h = (Tiger)hAnimal;
		Tiger t = (Tiger)tAnimal;
		//h.hunting();
		t.hunting();
		hAnimal.move();
		
		// instanceof 연산자 => true/false 리턴 // 어떤 클래스로 생성 되었는지 확인하는 키워드
		// 객체명 instanceof 클래스명
		System.out.println(hAnimal instanceof Tiger);
		System.out.println(tAnimal instanceof Tiger);
		
		if(hAnimal instanceof Tiger) {
			Tiger t2 = (Tiger)hAnimal;
		}
		
		// 배열 생성
		Animal[] aniList = new Animal[5];
		int cnt = 0;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		aniList[cnt] = eAnimal;
		cnt++;
		
		System.out.println("--DownCasting--");
		test.testDownCasting(aniList, cnt);
		
	}
	
	// 다형성을 하는 이유
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	// 부모 형으로 객체를 생성하게 되면 자식이 개별적으로 가지고 있는 메서드를 사용할 수 없음
	// 자식이 개별로 가지고 있는 메서드를 사용하려면 다운캐스팅을 해줘야 함 ★
	// 부모의 형이 아닌 자식의 형태로 변환을 해줘야 함
	
	public void testDownCasting(Animal[] list, int cnt) {
		for(int i=0; i<cnt; i++) {
			Animal ani = list[i];
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBook();
			}else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			}else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			}else {
				System.out.println("casting Error");
			}
		}
	}

}



class Animal{
	
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
	
	public void eating() {
		
	}
	
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 멀리 날아 갑니다.");
	}
	
}