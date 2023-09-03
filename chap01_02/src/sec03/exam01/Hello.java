package sec03.exam01;
/*
작성자 : 김진광
작성일 : 2025.12.31
*/
public class Hello {
//	프로그램 실행 진입점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		콘솔에 출력하는 실행문
//		System.out.println("Hello, Java");
		
		long a = 2l;
		float b = 1.8f;
		double c = 2.5;
		String d = "3.9";
		int result = (int)a + (int)(b + c) + (int)Double.parseDouble(d);
		System.out.println(result);
	} // end of main

} // end of class
