package Day14_lotto;

import java.util.Arrays;

public class LottoE extends Lotto{

	private int[] lottoE = new int[7];
	private int bonusNum = 0;
	
	public LottoE() {
		int i = 0;
		while(i < lottoE.length) {
			int r = (int)(Math.random()*45)+1;
			if(!isContain(lottoE, r)) {
				lottoE[i] = r;
				i++;
			}
		}
		for(;;) {
			int r = (int)(Math.random()*45)+1;
			if(!isContain(lottoE, r)) {
				bonusNum = r;
				lottoE[6] = bonusNum;
				break;
			}
		}
	}

	public int[] getLottoE() {
		return lottoE;
	}

	public void setLottoE(int[] lottoE) {
		this.lottoE = lottoE;
	}

	public int getBonusNum() {
		return bonusNum;
	}

	public void setBonusNum(int bonusNum) {
		this.bonusNum = bonusNum;
	}

	@Override
	public String toString() {
		return "[당첨 번호=" + Arrays.toString(lottoE);
	}

	
//	public Lotto[] addLotto() {
//		if(lottoE.length == cnt) {
//			Lotto[] tmp = new Lotto[lottoE.length+5];
//			System.arraycopy(lottoE, 0, tmp, 0, lottoE.length);
//			lottoE = tmp;
//		}
//		Lotto l = new Lotto();
//		lottoE[cnt] = l;
//		cnt++;
//		return lottoE;
//	}
}
