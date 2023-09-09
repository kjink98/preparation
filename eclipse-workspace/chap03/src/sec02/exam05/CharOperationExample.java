package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO char 타입의 산술 연산
		char c1 = 'A' + 1; // char c1= 66;으로 컴파일 됨
		char c2 = 'A';
//		char c3 = c2 + 1; // c2의 결과는 int 값으로 변환 되기 때문에 c2 + 1 도 int 값으로 변환. 따라서 결과도 int
		char c3 = (char) (c2 + 1);
		int c4 = c2 + 1;
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);		
		System.out.println("c4: " + c4);		
	}

}
