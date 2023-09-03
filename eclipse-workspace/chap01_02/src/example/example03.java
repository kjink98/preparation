package example;
import java.util.Scanner;
public class example03 {

	public static void main(String[] args) {
		// TODO page 99, 확인문제 03
		Scanner sc = new Scanner(System.in);
	
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("주민번호 앞 6자리: ");
		int jumin = sc.nextInt();
		
		System.out.println("전화번호: ");
		String tel1 = sc.next(), tel2 = sc.next(), tel3 = sc.next();
		
		System.out.println(name);
		System.out.println(jumin);
		System.out.println(tel1 + "-" + tel2 + "-" + tel3);
	
		}

}
