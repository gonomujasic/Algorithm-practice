package practice;

import java.util.ArrayList;

public class BinaryNotation {

	public static void binaryNotation() {

		// 10진법을 2진법으로 변환시켜라.
		// 10진수를 2로 나누어 나머지를 입력시켜라.
		// 담는건 배열에 담고, 뽑아낼 때는 프린트를 반대로 돌리면 됨.

		int num;
		ArrayList binary = new ArrayList<>();

		System.out.println("10진수 정수를 입력하세요.");
		num = Main.scan.nextInt();

		while (num != 0) {// 1을 2로 나누면 몫이 0이 되고 나머지는 1이 됨.

			binary.add(num % 2);
			num = num / 2;

			/*
			 * if(num ==1){ binary.add(num); break; }
			 */
		}

		for (int i = binary.size() - 1; i >= 0; i--) {
			System.out.print(binary.get(i));
		}
	}

	public static void reverseArray() {

		// 10진수를 2진수로 바꾼것을 끝에서부터 처음으로 저장함.
		// 미리 2진수의 길이를 알아서 배열의 끝에서부터 하나씩 집어 넣어야 함.

		int num;
		int i = 1;
		int[] binary = new int[100];
		int k = 0;
		System.out.println("10진수 정수를 입력하세요.");
		num = Main.scan.nextInt();

		while (true) {

			if (num < Math.pow(2, i)) {
				System.out.println("2진법 변환시 자리수는 " + i + "입니다.");
				k = i;
				break;
			}
			i++;
		}

		while (num != 0) {
			// 미리 배열의 길이를 알아야 함.
			// 1. 2의 제곱으로 끊어서 계산. 10이면 2의4제곱보다 작으니 네자리임.

			binary[i-1] = num % 2;
			num = num / 2;
			i--;
		}
		System.out.println("입력값의 이진수는");
		for (int j = 0; j < k ; j++) {
			System.out.print( binary[j]);
		}
	}
}
