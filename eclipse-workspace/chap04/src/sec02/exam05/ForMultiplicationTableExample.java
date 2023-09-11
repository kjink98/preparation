package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO 구구단 출력하기
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " X " + n + " = " + m*n);
			}
		}

	}

}
