package practice;

public class ArrayDiagonalLine {
//******************************************************************** 어려움
	static void arrayDiagonalLine() {

		// 0 1 2 3 4
		
		// 1 2 4 7 11
		// 3 5 8 12 16
		// 6 9 13 17 20
		// 10 14 18 21 23
		// 15 19 22 24 25

		//  회전수 = i + j  
		// 0번째는 [0][0]
		// 1번째는 [0][1],[1][0]
		// 2번째는 [0][2],[1][1],[2][0]
		// 3번째는 [0][3],[1][2],[2][1],[3][0]
		// 4번째는 [0][4],[1][3],[2][2],[3][1],[4][0]
		// 5번째는 [1][4],[2][3],[3][2],[4][1]
		// 6번째는 [2][4],[3][3],[4][2]
		// 7번째는 [3][4],[4][3]
		// 8번째는 [4][4]
		// 9번 회전하고 i는 1씩 증가. j는 1씩 감소.
		// 작은 포문 회전수 1씩 증가시키다가 5번째부터 회전수 1씩 감소.
		//

		int[][] numbers = new int[5][5];
		int i = 0;
		int j = 0;
		int m = 0;
		int k = 1;
		int o = 1;
		int n = 0;
		int r = 0;

		for (int c = 0; c < 9; c++) {

			for (n = 0; n <= m; n++) {

				numbers[i][j] = k++;
				i++;
				j--;
			}
			m = m + o;
			j = m;
			i = r;

			if (c == 3) {// 돌리는 횟수를 조절하기 위함.
				o = o * (-1);
			}
			if (c >= 3) {
				j = 4;
				r++;
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {

				System.out.print(numbers[i][j] + " ");

			}
			System.out.println(" ");

		}
	}

	static void arrayDiagonalLine2() {// 책버전

		int[][] numbers = new int[5][5];
		int i = 0;
		int j = 0;
		int l = 0;
		int k = 0;

		for (l = 0; l <= 8; l++) {// 총 회전수

			for (i = 0; i <= 4; i++) {//

				j = l - i;

				if (j < 0)
					continue;

				if (j > 4)
					continue;

				k++;
				numbers[i][j] = k;
			}
		}
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {

				System.out.print(numbers[i][j] + " ");

			}
			System.out.println(" ");

		}
	}
}
