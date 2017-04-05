package practice;

public class ReverseNumberPlus {

	static void reverseNumberPlus() {

		// 데이터를 읽어서 역순으로 변환한 후 원래의 데이터와 더하여 출력하는 순서도를 작성하라.
		// 예를들어 123456이 입력되면 654321로 변환한 후 원래의 수와 더하여 출력한다.
		// 단, 입력되는 값은 6자리 정수이고 999999가 입력되면 종료한다.

		int[] numbers = new int[6];
		int[] reverseNumber = new int[6];
		int number = 0;
		for (int i = 0; i < numbers.length; i++) {

			System.out.println("값을 입력해주세요.");
			numbers[i] = Main.scan.nextInt();
			number += numbers[i];

		}

		if (number == 54) {
			System.out.println("종료됩니다.");
			System.exit(number);

		}

		int j = 5;
		for (int i = 0; i < numbers.length; i++) {

			reverseNumber[j] = numbers[i];
			j--;
		}

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = numbers[i] + reverseNumber[i];
			System.out.print(numbers[i] + " ");
		}
	}

	static void reverseNumberPlus2() {// 책 풀이

		int number = 0;
		int num = 0;
		int ber = 0;
		int[] numbers = new int[6];
		while (true) {
			System.out.println("값을 입력하세요.");
			number = Main.scan.nextInt();

			if (number == 999999) {
				System.out.println("종료됩니다.");
				break;
			}
			num = number;
			for (int i = 0; i < numbers.length; i++) {
				
				numbers[i] = num % 10;
				num = num / 10;
				//123456
			}
			
			for( int j = 0; j <numbers.length-1; j++){
				
				ber += numbers[j];
				ber *= 10;
			}
			
			ber += numbers[5];
			num = number +ber;
			System.out.println(number+" "+ ber+" "+num);
		}
	}
}
