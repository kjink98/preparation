package sec03.verify;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO P210 - 2
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인 성공");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("아이디 오류");
		} else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("비밀번호 오류");
		}
	}

}
