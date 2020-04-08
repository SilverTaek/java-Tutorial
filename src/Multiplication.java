import java.util.Scanner;

public class Multiplication {
	public static void main(String[]args) {
		System.out.println("원하는 구구단을 입력하시요");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 구구단"+"="+number+"입니다.");
		
		if(number < 2) {
			System.out.println("값이 너무 작습니다");
		}
		else if(number > 9) {
			System.out.println("값이 너무 큽니다");
		}
		else {
			for(int a=1; a<10; a++) {
				System.out.println(number * a);
			}
		}
	}

}
