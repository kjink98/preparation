package sec02.exam10;

public class CoutinueExample {

	public static void main(String[] args) {
		// TODO continue�� ����� for��
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			} // if�� ����
			System.out.println(i);
		}
	}

}
