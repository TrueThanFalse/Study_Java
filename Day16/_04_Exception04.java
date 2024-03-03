package Day16;

public class _04_Exception04 {

	public static void main(String[] args) {
		
		// 멀티 캐치
		/* try{
		 * 	 code...
		 * }catch(하위 예외 클래스 e){
		 * 
		 * }catch(하위 예외 클래스 e){
		 * 
		 * }catch(최상위 예외 클래스 e){
		 * 
		 * }
		 */
		
		try {
			int res = 1/0;
			System.out.println(res);
			int arr[] = null;
			int arr1[] = new int[3];
			arr1[5] = 10;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외 발생");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다");
		} catch (Exception e) { // 마지막은 최상위 Exception => default 느낌~
			e.printStackTrace();
		}
		System.out.println("종료!");
		

	}

}
