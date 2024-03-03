package Day22;

class MyThread2 implements Runnable{

	// Thread를 구현하려면 반드시 run() 메서드를 구현 해야 함
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<50; i++) {
			System.out.println(i+"번째, "+Thread.currentThread().getName());
//			Thread.currentThread().getName() == getName()
		}
	}
	
}

public class _03_Thread02 {

	public static void main(String[] args) {
		
		/* Runnable를 구현하는 방법
		 * 직접 객체 생성만으로는 실행 불가능
		 * Thread 클래스의 생성자로 Runnable 구현 객체를 추가
		 */
		
		MyThread2 mth = new MyThread2();
		// mth.start 가 없다.
		
		Thread th = new Thread(mth);
		th.start();
		
		try {
			th.join(); // join : 내가 끝날때까지 기다려!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
//		try {
//			th2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("main End!!!"); // 마지막으로 보내고 싶다~
		
		
	}

}
