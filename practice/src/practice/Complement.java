package practice;

public class Complement {

	public static void complement() {

		// 0또는 1로 입력되는 다섯 개의 숫자를 배열에 입력받아 1의 보수와 2의 보수를 구하는 순서도를 완성하시오.
		// 2진수의 보수를 구하라.
		// 1의 보수는 1을 0으로 0을 1로 바꾸면 되고, 2의 보수는 1의 보수에 1을 더하면 된다.
		// 2의 보수는 1을 더하는데 어떻게??

		int[] numbers = new int[5];
		int num = 0;
		int[] complementOfOne = new int[5];
		int[] complementOfTwo = new int[5];
		int digit = 1;

		int i = 0;
		while (i < 5) {

			System.out.println("0또는 1을 입력하세요.");

			num = Main.scan.nextInt();

			if (num == 0 || num == 1) {
				numbers[i] = num;
				i++;
			}
		}

		// 1의보수
		for (int j = 0; j < numbers.length; j++) {

			complementOfOne[j] = 1- numbers[j];

			System.out.print(numbers[j]);

		}
		System.out.print("의 1의 보수: ");

		for (int j = 0; j < numbers.length; j++) {
			System.out.print(complementOfOne[j]);
		}

		// 2의 보수
		for (int k = 0; k < numbers.length; k++) {

			complementOfTwo[k] = 1- numbers[k];

		}
		System.out.println("");

		// 2의보수를 어케 표현할 것인가.
		//1. 반대로 바꾼 후 . 자리에 0이 있으면 그대로 1더하고 1이 있으면 0으로 바꾸고 자리수를 1로 증가 후 다음 자리수로
		// 넘어감. 다음자리수에서도 반복.
		// 자릿수 초과하는 문제는? 11111일 때만 자릿수 초과하므로 이 때만 00000으로 바꾸도록 설정?
		//2. 2로 나눈 나머지를 배열 자리에 넣으면 됨. 
		// 00000 1을 더하고 , 11111이면 1을 더하고 그다음순서에 

		for(int k = 0; k< complementOfTwo.length; k++){
			
			complementOfTwo[k] = complementOfOne[k] +digit;//배열수의 1의보수에 자릿수를 더함. 처음에는 1을 더함.  
			complementOfTwo[k] = complementOfTwo[k] % 2;//배열수가 2가 되면 그 나머지는 0이 됨. 따라서 그 자리에는 0이 들어가고 자릿수는 1이 된다. 
			digit = complementOfOne[k] * digit;//배열수가 1이었으면 자릿수는 1이 됨. 배열수가 1이 아니었으면 자릿수는 0이 됨. 
			//배열수가 1일 때 자릿수가 0이면 digit엔 0이 들어감. 
			//10101 01011 10101
		}
		
		/*if (complementOfTwo[0] == 1 && complementOfTwo[1] == 1 && complementOfTwo[2] == 1 && complementOfTwo[3] == 1 && complementOfTwo[4] == 1) {
			System.out.println("00000의 2의 보수: " + "00000");
		} else {
			for (int k = complementOfTwo.length -1; k >= 0; k--) {

				if (complementOfTwo[k] == 1) {
					complementOfTwo[k] = 0;

				} else {
					complementOfTwo[k] = 1;
					break;
				}
			}
			System.out.println("");
			
			for(int k = 0; k<complementOfTwo.length; k++){
			System.out.print(numbers[k]);
			}
			System.out.print("의 2의 보수: ");
			for(int k = 0; k<complementOfTwo.length; k++){
			System.out.print(complementOfTwo[k]);
			}
		}*/
	}
}