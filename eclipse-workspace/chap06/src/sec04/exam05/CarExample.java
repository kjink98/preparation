package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO 클래스 외부에서 메소드 호출
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");

	}

}
