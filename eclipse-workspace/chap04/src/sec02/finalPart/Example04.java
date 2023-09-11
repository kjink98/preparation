package sec02.finalPart;

public class Example04 {

	public static void main(String[] args) {
		// TODO P161-04
//		4x+5y=60
		int value = 0;
		for(int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (x * 4 + y * 5 == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			} // y for문 종료

		} // x for문 종료

	}

}
