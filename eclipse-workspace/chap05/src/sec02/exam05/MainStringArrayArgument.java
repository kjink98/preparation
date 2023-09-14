package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO main() 메소드의 매개 변수
		// 입력된 데이터 개수가 2개가 아닌 경우
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			// 프로그램 강제 종료
			System.exit(0);
		}
		
		// 첫 번째 데이터 얻기
		String strNum1 = args[0];
		// 두 번째 데이터 얻기
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
