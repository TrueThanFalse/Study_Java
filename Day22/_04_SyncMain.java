package Day22;

public class _04_SyncMain {

	public static Bank myBank = new Bank(); // 공유 영역에 static으로 메모리 올리기
	
	public static void main(String[] args) {
		
		/* Thread를 상속받는 클래스 생성
		 * 홍길동이 가지고 있는 계좌 - 홍길동+김순이(생활비 계좌) 같이 사용 중
		 * 잔액 : 10000
		 * 홍길동 5000출금, 동시에 김순이가 10000출금
		 * 
		 * 동기화 키워드 : synchronized
		 */
		
		Hong h = new Hong();
		h.start();
		
		Kim k = new Kim();
		k.start();
		
	}

}

class Hong extends Thread{
	public void run() { // 입금
		System.out.println("잔액: "+ _04_SyncMain.myBank.getMoney());
		System.out.println("입금 시작!");
		_04_SyncMain.myBank.saveMoney(3000);
		System.out.println("입금 후 잔액: "+ _04_SyncMain.myBank.getMoney());
	}
}

class Kim extends Thread{
	public void run() { // 출금
		System.out.println("잔액: "+ _04_SyncMain.myBank.getMoney());
		System.out.println("출금 시작!");
		_04_SyncMain.myBank.minusMoney(5000);
		System.out.println("출금 후 잔액: "+ _04_SyncMain.myBank.getMoney());
	}
}

class Bank{
	
	private int money = 10000;
	
	// 입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(3000); // 3초 대기
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m+save);
		
	}

	// 출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(500); // 0.5초 대기
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m-minus);
		
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}