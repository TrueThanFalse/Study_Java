package Day17;

public class _02_PasswordException extends IllegalArgumentException{

	// IllegalArgumentException => Exception 기능을 활성화 시켜주는 상위 Exception 클래스
	public _02_PasswordException(String message) {
		super(message);
	}
	
}
