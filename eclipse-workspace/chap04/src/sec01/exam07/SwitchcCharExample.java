package sec01.exam07;

public class SwitchcCharExample {

	public static void main(String[] args) {
		// TODO char Ÿ���� switch��
		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}

	}

}
