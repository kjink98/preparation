package sec05.exam04;


public class SingletonExample {

	public static void main(String[] args) {
		// TODO 싱글톤 객체
//		Singleton obj1 = new Singleton(); // 컴파일에러
//		Singleton obj2 = new Singleton(); // 컴파일에러
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
