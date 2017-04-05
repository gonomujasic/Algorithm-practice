package practice;

public class ArrayMatrix {

	static void arrayMatrix() {

		// 2차원 배열의 크기를 입력 받아 그림과 같이 숫자를 채운 후 행과 열을 바꿔 출력하는 순서도를 작성하라.
		// 여기서는 행으로 5를 열로 3을 입력 받았다고 가정.

		int col = 0;
		int row = 0;
		int k = 1;

		System.out.println("행값을 입력하세요");
		row = Main.scan.nextInt();
		System.out.println("열값을 입력하세요");
		col = Main.scan.nextInt();

		int[][] matrixA = new int[row][col];
		int[][] matrixB = new int[col][row];

		for (int i = 0; i <= row - 1; i++) {

			for (int j = 0; j <= col - 1; j++) {

				matrixA[i][j] = k++;
			}
		}

		System.out.println(" ");

		for (int i = 0; i < row; i++) {// 원래 대로 출력

			for (int j = 0; j < col; j++) {

				System.out.print(matrixA[i][j]);
			}
			System.out.println(" ");
		}

		// 행빼기 열은 5-3 = 2
		// row + (row-col)
		// 이미 배열에 들어있는데 배열을 새로 만들어서 집어 넣어 줘야 함.
		// [1][0]과 [1][1]을 [0][3],[0][4]에 집어 넣어야 함.
		// 1 2 3 1 2 3 4 5
		// 4 5 6 6 7 8 9 10
		// 7 8 9 11 12 1314 15
		// 101112
		// 131415
		System.out.println(" ");
		int l = 0;
		int m = -1;
		for (int i = 0; i <= row - 1; i++) {

			for (int j = 0; j <= col - 1; j++) {

				m += 1;
				matrixB[l][m] = matrixA[i][j];
				if (m >= (row - 1)) {
					l++;
					m = -1;
				}
			}
		}
		for (int i = 0; i < col; i++) {// 변형해 출력
			for (int j = 0; j < row; j++) {

				System.out.print(matrixB[i][j]);
			}
			System.out.println(" ");
		}
	}
}
