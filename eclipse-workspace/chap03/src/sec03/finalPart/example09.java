package sec03.finalPart;

import java.util.Scanner;

public class example09 {

	public static void main(String[] args) {
		// TODO P129-09
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		double num1 = sc.nextDouble();
		System.out.print("�� ��° �� : ");
		double num2 = sc.nextDouble();
		
		if(num2 == 0 || num2 == 0.0) {
			System.out.println("���:���Ѵ�");
		} else
			System.out.println(num1 / num2);

	}

}
