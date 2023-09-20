package sec02.verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO p201 6번
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				System.out.println(scores.length);
			} else if (selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				int maxScore = 0;
				int avgScore = 0;
				for(int i : scores) {
					if(maxScore < i) {
						maxScore = i;
					}
				}
				int totalScore= 0;
				for(int i=0; i<scores.length; i++) {
					totalScore += scores[i];
				}
				avgScore = totalScore / scores.length;
				System.out.println("최고 점수: " + maxScore);
				System.out.println("평균 점수: " + avgScore);
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

}
