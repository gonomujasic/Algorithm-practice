package practice;

public class ArrayIsoscelesTriangle {

	static void arrayIsoscelesTriangle() {

		// 배열의 열 크기를 입력 받아 배열의 크기에 따라 아래와 같이 기억시키는 순서도를 작성하라. 4를 입력받았다고 가정

		// 0 0 0 10
		// 0 0 5 11
		// 0 2 6 12
		// 1 3 7 13
		// 0 4 8 14
		// 0 0 9 15
		// 0 0 0 16

		int number = 0;
		int k = 1;
		
		System.out.println("열의 크기를 입력하세요.");
		number = Main.scan.nextInt();

		int[][] numbers = new int[(number * 2) - 1][number];

		int s = ((number*2)-1)/2;
		int e = ((number*2)-1)/2;
		
		for (int j = 0; j < number; j++) {
			for (int i = s; i <= e; i++) {

				numbers[i][j] = k++;

			}

			s--;
			e++;

		}

		for (int i = 0; i < (number * 2) - 1; i++) {
			for (int j = 0; j < number; j++) {

				System.out.print(numbers[i][j]);

			}

			System.out.println(" ");
		}

	}

}
