package sec03.finalPart;

import java.util.Scanner;

public class example11 {

	public static void main(String[] args) {
		// TODO P130-11
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String name = scanner.next();
		
		System.out.print("��к�ȣ : ");
		String strPassword = scanner.next();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
		} // ù ��° if�� ����
		else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}
		

	}

}
