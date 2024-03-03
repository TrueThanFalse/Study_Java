package Day14_lotto;

import java.util.Scanner;

public class LottoManager implements program{

	int winNum=0; // 일반 번호 6개 당첨 갯수
	int bonusWin=0; // 보너스 번호 당첨 갯수
	LottoE[] pack = new LottoE[5];
	int cnt=0; // pack 배열의 index
	int[] user = new int[6];
	
	public int[] createLotto(Scanner scan) {
		Lotto l = new Lotto();
		int i=0;
		while(i < l.getLotto().length) {
			System.out.println((i+1)+"번째 숫자 입력>");
			int num = scan.nextInt();
			if(!l.isContain(l.getLotto(), num)) {
				l.getLotto()[i] = num;
				i++;
			}else {
				System.out.println("중복된 숫자입니다. 다시 입력하세요.");
			}
		}
		user = l.getLotto();
		System.out.println("---생성된 로또 번호---");
		for(int j=0; j<l.getLotto().length; j++) {
			System.out.print(l.getLotto()[j]+" ");
		}
		System.out.println();
		return user;
	}

	
	public int[] createLottoAuto() {
		Lotto l = new Lotto();
		user = l.getLotto();
		System.out.println("---생성된 로또 번호---");
		for(int i=0; i<l.getLotto().length; i++) {
			System.out.print(l.getLotto()[i]+" ");
		}
		System.out.println();
		return user;
	}

	
	public void insertLottoAuto() {
		if(cnt == pack.length) {
			LottoE[] tmp = new LottoE[pack.length+5];
			System.arraycopy(pack, 0, tmp, 0, pack.length);
			pack = tmp;
		}
		LottoE l = new LottoE();
		pack[cnt] = l;
		cnt++;
		return;
	}

	
	public void checkLotto() {
		
		for(int i=0; i<pack[cnt-1].getLottoE().length; i++) {
			System.out.print(pack[cnt-1].getLottoE()[i]+" ");
		}
		
		
		System.out.println("---------------");
		for(int i=0; i<user.length; i++) {
			for(int k=0; k<pack[cnt-1].getLottoE().length-1; k++) {
				if(user[i] == pack[cnt-1].getLottoE()[k]) {
					winNum++;
				}
				if(user[i] == pack[cnt-1].getLottoE()[6]) {
					bonusWin++;
				}
			}
		}
		switch(winNum) {
		case 6: System.out.println("1등 당첨!");
			break;
		case 5:
			if(bonusWin==1) {
				System.out.println("2등 당첨!");
			}else {
				System.out.println("3등 당첨!");
			}
			break;
		case 4: System.out.println("4등 당첨!");
			break;
		case 3: System.out.println("5등 당첨!");
			break;
			default: System.out.println("꽝!"); 
		}
		winNum=0;
		bonusWin=0;
		
//		for(int i=0; i<userNum.length; i++) {
//			for(int j=i+1; j<userNum.length; j++) {
//				if(userNum[i] > userNum[j]) {
//					int tmp = userNum[i];
//					userNum[i] = userNum[j];
//					userNum[j] = tmp;
//				}
//			}
//		}
//
//		for(int i=0; i<LottoNum.length-1; i++) {
//			for(int j=i+1; j<LottoNum.length; j++) {
//				if(LottoNum[i] > LottoNum[j]) {
//					int tmp = LottoNum[i];
//					LottoNum[i] = LottoNum[j];
//					LottoNum[j] = tmp;
//				}
//			}
//		}
//		Arrays.sort(arr1.getLotto());
//		Arrays.sort(arr2.getLotto());

//		for(int i=0; i<userNum.length; i++) {
//			for(int k=0; k<userNum.length; k++) {
//				if(userNum[i]==LottoNum[k]) {
//					cnt++;
//				}
//			}
//
//		}
		
	}

	
	public void printLotto() {
		for(int i=cnt-1; i<pack.length; i--) {
			if(i==(cnt-1)) {
				System.out.print("최신");
				System.out.println(pack[i]);
			}else if(i>=0){
				System.out.println(pack[i]);
			}else {
				return;
			}
		}
	}
}
