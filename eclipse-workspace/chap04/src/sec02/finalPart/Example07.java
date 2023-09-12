package sec02.finalPart;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// TODO P161-07
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------");
			System.out.print("선택> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				balance = 10000;
				System.out.println(balance);
				break;
			case 2:
				balance = 2000;
				System.out.println(balance);
				break;
			case 3:
				balance = 8000;
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("보기 중에 선택해주세요");
				break;
				
			}
		}

	}

}
