package Day14_lotto;

import java.util.Arrays;

public class Lotto {

	private int[] lotto = new int[6];
//	private int bonusNum = 0;
	

	public Lotto() {
		int i = 0;
		while(i < lotto.length) {
			int r = (int)(Math.random()*45)+1;
			if(!isContain(lotto, r)) {
				lotto[i] = r;
				i++;
			}
		}
//		for(;;) {
//			int r = (int)(Math.random()*45)+1;
//			if(!isContain(lotto, r)) {
//				bonusNum = r;
//				lotto[6] = bonusNum;
//				break;
//			}
//		}
	}
	
//	public void create(Scanner scan) {
//		int i = 0;
//		while(i < lotto.length) {
//			System.out.println(i+"번째 로또번호 입력>");
//			int r = scan.nextInt();
//			if(!isContain(lotto, r)) {
//				lotto[i] = r;
//				i++;
//			}else {
//				System.out.println("---중복된 숫자입니다. 다시 입력하세요---");
//			}
//		}
//	}
	
	
	public boolean isContain(int[] arr, int random) {
		for(int tmp: arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	@Override
	public String toString() {
		return "Lotto [lotto=" + Arrays.toString(lotto) + "]";
	}
}
