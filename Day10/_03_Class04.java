package Day10;

public class _03_Class04 {

	public static void main(String[] args) {
		
		/* Card 클래스 생성
		 * 포커 카드
		 * 멤버변수 : 모양(♥ ♣ ◆ ♠), 숫자(1~10,J,Q,K)
		 */
		
		Card c = new Card();
		c.print();
		c.setForm('♠');
		c.setNum(11);
		c.print();
		c.setNum(15);
		c.print();
		c.setForm('♥');
		c.setNum(2);
		c.print();

	}

}

/* card 클래스 구성 요소
 * 멤버변수 : 모양(♥ ♣ ◆ ♠), 숫자(1~10,J,Q,K)
 * 생성자 : 기본 생성자 = 하트1
 * 모양과 숫자가 들어올 수 없는 값이 들어오면 => 하트1 리턴
 */

class Card{
	
	public char form; // 모양
	public int num; // 숫자
	
	// 생성자
	// 기본 생성자를 자동으로 받지 않고 직접 작성
	public Card() {
		form = '♥';
		num = 1;
	}
	
	// print 메서드
	public void print() {
		System.out.print(form);
		switch(num) {
		case 11 : System.out.print("J"+" ");
			break;
		case 12 : System.out.print("Q"+" ");
			break;
		case 13 : System.out.print("K"+" ");
			break;
			default : System.out.print(num+" ");
		}
	}

	
	//getter&setter
	public char getForm() {
		return form;
	}

	public void setForm(char form) {
		switch(form) {
		case '♥': case '♣': case '◆': case '♠':
			this.form = form;
			break;
			default: this.form = '♥';
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(1<=num && num<=13) {
			this.num = num;
		}else {
			this.num = 1;
		}
	}
	
	
	
}
