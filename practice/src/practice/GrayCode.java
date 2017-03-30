package practice;

public class GrayCode {

	public static void grayCode() {

		// 0 또는 1로 입력되는 다섯 개의 숫자를 배열에 입력 받아 그레이 코드 또는 이진수로 변환하는 순서도를 완성하시오.
		// 첫번째그레이비트는 이진수비트 그대로 쓰고, 그다음에는 그레이코드 이전비트와 두번째 이진수비트 간에 xor연산을 해야함.
		// xor은 if문으로 둘다 0이나 1이면 0이되고 그밖에는 1로 바꿈.

		int[] numbers = new int[5];
		int[] grayCode = new int[5];
		int[] binaryNumber = new int[5];
		int i = 0;

		while (i < 5) {
			System.out.println("0 또는 1을 입력하세요.");
			int num = Main.scan.nextInt();
			if (num == 0 || num == 1) {

				numbers[i] = num;
				i++;
			} else {
				System.out.println("허용되지 않은 입력값입니다.");
			}
		}
		// 이진수 -> 그레이코드
		// 첫 2진수는 그대로 내려쓰고, 두 번째 그레이 비트부터는 변경할 이진수의 해당 번째 비트와 그 왼쪽의 비트를 xor연산.
		grayCode[0] = numbers[0];
		for (int k = 0; k < numbers.length - 1; k++) {

			if ((numbers[k] == 0 && numbers[k + 1] == 0) || (numbers[k] == 1 && numbers[k + 1] == 1)) {
				grayCode[k + 1] = 0;
			} else {
				grayCode[k + 1] = 1;
			}
		}
		for (int k = 0; k < grayCode.length; k++) {
			System.out.print(grayCode[k]);
		}

		System.out.println("");
		
		// 그레이코드 -> 이진수
		binaryNumber[0] = grayCode[0];
		for (int j = 0; j < grayCode.length - 1; j++) {

			if ((binaryNumber[j] == 0 && grayCode[j + 1] == 0) || (binaryNumber[j] == 1 && grayCode[j + 1] == 1)) {
				binaryNumber[j + 1] = 0;
			} else {
				binaryNumber[j + 1] = 1;
			}
		}

		for (int k = 0; k < grayCode.length; k++) {
			System.out.print(binaryNumber[k]);
		}
	}
}
