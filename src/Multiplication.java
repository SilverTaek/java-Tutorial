import java.util.Scanner;

public class Multiplication {
	public static void main(String[]args) {
		System.out.println("���ϴ� �������� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� ������"+"="+number+"�Դϴ�.");
		
		if(number < 2) {
			System.out.println("���� �ʹ� �۽��ϴ�");
		}
		else if(number > 9) {
			System.out.println("���� �ʹ� Ů�ϴ�");
		}
		else {
			for(int a=1; a<10; a++) {
				System.out.println(number * a);
			}
		}
	}

}
