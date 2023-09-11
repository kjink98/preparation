package sec02.finalPart;

public class Example02 {

	public static void main(String[] args) {
		// TODO P160-2
		int cnt = 0;
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				cnt += i;
			}
		}
		System.out.println(cnt);

	}

}
