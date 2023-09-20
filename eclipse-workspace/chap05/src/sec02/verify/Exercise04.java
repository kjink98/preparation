package sec02.verify;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO P-200 4번
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i : array) {
			if(max < i) {
				max = i;
			}
		}
		
		System.out.println("max: " + max);

	}

}
