package sec01.exam06;

import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClassExemple {

	public static void main(String[] args) {
		System.out.println("1)---------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); // 필드의 rc 사용
		myClass1.rc.setVolume(5); // 필드의 rc 사용
		
		System.out.println("2)---------------------");
		
		MyClass myClass2 = new MyClass(new Audio()); // 생성자의 매개값으로 구현 객체 대입
		
		System.out.println("3)---------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();

		System.out.println("4)---------------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}
