package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO char Ÿ���� ��� ����
		char c1 = 'A' + 1; // char c1= 66;���� ������ ��
		char c2 = 'A';
//		char c3 = c2 + 1; // c2�� ����� int ������ ��ȯ �Ǳ� ������ c2 + 1 �� int ������ ��ȯ. ���� ����� int
		char c3 = (char) (c2 + 1);
		int c4 = c2 + 1;
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);		
		System.out.println("c4: " + c4);		
	}

}
