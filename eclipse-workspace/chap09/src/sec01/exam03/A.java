package sec01.exam03;

public class A {
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	class B {
		// 모든 필드와 메소드에 접근할 수 있음
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		// 인스턴스 필드와 메소드에 접근할 수 없음
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
		}
	}
}
