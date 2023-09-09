package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO 산술 연산자
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		// v1 한개만 형변환 : 5.0 / 2 = 2.5
		double result6 = (double) v1 / v2;
		System.out.println("result6 = " + result6);
		
		// v1 / v2 의 값을 형 변환 : 5 / 2 = 2 ==> 2.0
		double result7 = (double) (v1 / v2);
		System.out.println("result7 = " + result7);
				
	}

}
