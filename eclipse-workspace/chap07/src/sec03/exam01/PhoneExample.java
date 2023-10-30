package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone은 추상 클래스이므로 오류
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
