package practice;

public class Array7x7 {

	static void array7x7() {

		// 배열의 크기를 입력 받아 배열의 크기에 따라 아래와 같이 기억시키는 순서도를 작성하라. 단 배열의 크기는 홀수로만 입력 가능

		System.out.println("배열의 크기를 홀수만 입력하세요.");
		int number = Main.scan.nextInt();
		int k = 1;
		int e = number;
		int[][] numbers = new int[number][number];

		for (int i = 0; i < number; i++) {

			for (int j = 0; j != e; j++) {

				numbers[i][j] = k++;
			}
			if ((number / 2) > i) {

				e--;

			} else {

				e++;
			}
		}

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {

				System.out.print(numbers[i][j]);

			}
			System.out.println(" ");
		}
	}

}
