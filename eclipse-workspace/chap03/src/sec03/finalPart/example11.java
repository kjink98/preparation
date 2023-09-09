package sec03.finalPart;

import java.util.Scanner;

public class example11 {

	public static void main(String[] args) {
		// TODO P130-11
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = scanner.next();
		
		System.out.print("비밀빈호 : ");
		String strPassword = scanner.next();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} // 첫 번째 if문 종료
		else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}
		

	}

}
