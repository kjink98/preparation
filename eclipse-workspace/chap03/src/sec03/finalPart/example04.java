package sec03.finalPart;

public class example04 {

	public static void main(String[] args) {
		// TODO P128-04
		int pencils = 534;
		int students = 30;
		
		// 학생 1명이 가지는 연필 개수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 개수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
