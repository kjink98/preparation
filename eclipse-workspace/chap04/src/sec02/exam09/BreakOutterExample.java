package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO 바깥쪽 반복문 종료
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			} //lower for문 종료
		} // upper for문 종료
	System.out.println("프로그램 실행 종료");
	}

}
