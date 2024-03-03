package Day17;

public class _01_사용자지정Exception {

	public static void main(String[] args) {
		
		/* passwordException
		 * 
		 * - 비밀번호는 null일 수 없다.
		 * - 비밀번호의 길이는 5글자 이상
		 * - 비밀번호는 문자로만 이루어지면 안 됨. (문자+숫자+특수문자)
		 * 
		 */
		
		String Password = "123";
		PasswordTest pass = new PasswordTest();

		try {
			pass.setPassword(Password);
			System.out.println(pass.getPassword());
		} catch (_02_PasswordException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws _02_PasswordException{
		if(password == null) {
			throw new _02_PasswordException("비밀번호는 null일 수 없습니다");
		}else if(password.length() < 5) {
			throw new _02_PasswordException("비밀번호의 길이는 5글자 이상이여야 합니다");
		}else if(password.matches("[a-zA-Z]+")) {
			throw new _02_PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		
		this.password = password;
	}
	
	
}
