package Day10;

public class _04_CardPack {

	/* CardPack 클래스
	 * - 카드팩 : 52장의 카드들
	 * 
	 * 멤버변수 : 카드를 52장 담을 수 있는 배열
	 * 생성자 : 52장의 카드를 모두 생성
	 * 메서드 : 
	 * - 카드를 섞는 기능
	 * - 카드를 한장 빼내는 기능
	 * - 카드 출력 => Card 클래스의 print 메서드 사용
	 * - 카드 초기화 메서드
	 */
	
	//멤버 변수
	private Card[] pack = new Card[52]; // index => 0~51
	private int cnt = 0; // pack 배열의 index 체크 용도
	
	//생성자 : 52장의 카드를 모두 생성
	public _04_CardPack() {
		// ♥(1~13) ♣(1~13) ♠(1~13) ◆(1~13)
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape ='♥'; break;
			case 2: shape ='♣'; break;
			case 3: shape ='♠'; break;
			case 4: shape ='◆'; break;
			}
			for(int j=1; j<=13; j++) { // 숫자
				Card c = new Card(); // 카드 1장 생성
				c.setForm(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++; // 마지막 cnt의 값은 52
			}
		}
	}
	
	//메서드
	
	// 카드를 섞는 기능
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int r = (int)(Math.random()*52)+0; // 0~51
			Card tmp = pack[i];
			pack[i] = pack[r];
			pack[r] = tmp;				
		}
	}
	
	// 카드를 한장 빼내는 기능
	// 리턴타입 : Card (카드 1장)
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		Card pick = pack[cnt];
		return pick;
	}
	
	// 카드 초기화
	public void reset() {
		cnt = 52;
	}
	
	//getter&setter
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	

	
}
