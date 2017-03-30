package practice;

public class ArrayBasic5x5 {

	static void arrayBasic5x5() {

		// 1부터 25까지 5행5열 배열에 채워라/

		int[][] numbers = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = k++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println(" ");

		}
	}

	static void array5x5() {

		// +5씩해서 넣는 방법 xxxxxx
		// j와 i열을 바꾸면 끝인데 ㅜㅜㅜㅜㅜㅜㅜㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
		int[][] numbers = new int[5][5];
		int k = 1;

		for (int i = 0; i < 5; i++) {

			k = 1 + i;

			for (int j = 0; j < 5; j++) {

				numbers[i][j] = k;
				k = k + 5;

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println(" ");

		}
	}
}
