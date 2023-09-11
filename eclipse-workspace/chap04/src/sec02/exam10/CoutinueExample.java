package sec02.exam10;

public class CoutinueExample {

	public static void main(String[] args) {
		// TODO continue를 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			} // if문 종료
			System.out.println(i);
		}
	}

}
