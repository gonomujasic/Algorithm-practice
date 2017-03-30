package practice;

public class Arrayfffffffff {

	static void arrayfffffffff() {

		// ㄹ 자로 채워라.

		// [1] [2] [3] [4] [5]
		// [10][9] [8] [7] [6]
		// [11][12][13][14][15]
		// [20][19][18][17][16]
		// [21][22][23][24][25]

		// 1행은 순서대로
		// 2행은 반대로
		// 3행은 순서대로
		// 4행은 반대로
		// 5행은 순서대로

		int[][] numbers = new int[5][5];
		int k = 1;

		for (int i = 0; i < 5; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < 5; j++) {
					numbers[i][j] = k++;
				}
			} else {

				for (int o = 4; o >= 0; o--) {

					numbers[i][o] = k++;

				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(numbers[i][j]);

			}
			System.out.println(" ");
		}

	}

	static void ffff() {

		// 책은 j열이 1부터 5까지 갔다가 다시 5부터 1로 가는 것을 반복하도록 짬.
		// j는 4가 되고 ,
		int[][] numbers = new int[5][5];
		int k = 1;
		int n = 1;// 한번 돌 때마다 -1로 바꿔줌
		int o = 4;// 5번 돌게 하기.
		int p = 0;
		int x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = p; j != o+n; j = j + n) {
				
				numbers[i][j] = k++;
				
			}
			System.out.println("ㅇㅇ");
			x = o;
			o = p;
			p = x;
			n = n * (-1);

		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(numbers[i][j]);

			}
			System.out.println(" ");
		}

	}

}
