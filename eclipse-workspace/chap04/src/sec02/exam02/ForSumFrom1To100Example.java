package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO 1부터 100까지 합을 출력
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합: " + sum);
	}

}
