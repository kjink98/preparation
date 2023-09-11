package sec02.finalPart;

public class Example06 {

	public static void main(String[] args) {
		// TODO P161-06
		for(int i=0; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				} // else문
			} // 두 번째 for문
			System.out.println("");
		}

	}

}
