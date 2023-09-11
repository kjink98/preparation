package sec02.finalPart;

public class Example03 {

	public static void main(String[] args) {
		// TODO P161-3

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			
			if (num1 + num2 != 5) {
				System.out.println("(" + num1 + ", " + num2 + ")");
			} else {
				System.out.println("(" + num1 + ", " + num2 + ")");
				break;
			} // else문 종료
		} // while문 종료
	}

}
