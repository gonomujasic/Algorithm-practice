package practice;

public class ArrayMagicSquare {

	static void arrayMagicSquare() {

		// 가로와 세로의 합이 모두 같은 마방진을 완성하라
		// 17 24 01 08 15
		// 23 05 07 14 16
		// 04 06 13 20 22
		// 10 12 19 21 03
		// 11 18 25 02 09

		// 규칙성을 찾자.
		// 1부터 25까지의 숫자이고 가로나 세로의 합은 65이다.
		// 1과 25 양끝을 더한 수를 빼면 39를 남은 수 3으로 나누면 13
		// 1과 24를 더한 수 빼면 40
		// 17 47 10 31

		// 1:[0][2],2:[4][3],3:[3][4],4:[2][0], 1->2 4랑 1더하고, 2->3 바꾸고, 3->4 1이랑
		// 4빼고.
		// 5:[1][1], 4->5 1빼고 1더하고
		// 6:[2][1],7:[1][2], 5->6 1, 0 더하고, 6->7 바꾸고,
		// 8:[0][3],9:[4][4],10:[3][0], 7->8 1빼고 1더하고, 8->9 4랑 1더하고, 9->10 1이랑
		// 4빼고.
		// 11:[4][0],12:[3][1], 10->11 1, 0더하고, 11->12 1빼고 1더하고
		// 13:[2][2], 12->13 1빼고 1더하고
		// 14:[1][3],15:[0][4], 13->14 1빼고 1더하고, 14->15 1빼고 1더하고
		// 16:[1][4],17:[0][0],18:[4][1], 15->16 1,0 더하고, 16 ->17 1이랑 4빼고,
		// 17->18 4랑 1더하고
		// 19:[3][2],20:[2][3],
		// 21:[3][3],
		// 22:[2][4],23:[1][0],24:[0][1],25:[4][2]
		// 1 2 3 4 5 2 4 1 3 5 4
		// 1->2 4랑 1더하고, 2->3 바꾸고, 3->4 1이랑 4빼고. 4->5 1빼고 1더하고 5->6 1, 0 더하고,
		// 6->7 바꾸고, 7->8 1빼고 1더하고, 8->9 4랑 1더하고, 9->10 1이랑 4빼고. 10->11 1, 0더하고,
		// 11->12 1빼고 1더하고

		// 왼오대각선은 4씩 차이 오왼 대각선은 1씩 차이
		// 합이 26이 되게 대칭. 합이 [4][4]가 됨. 가운데는 13.
		// 1을 [0][2]에 놓으면 26-1인 25를 [4]-[0]=[4],[4]-[2]=[2]로 [4][2]에 놓는다.
		// 4진수라고 보고 행은 -1 열은 +1 근데 6, 11, 16, 21은 행만 1증가

		int[][] numbers = new int[5][5];
		int i = 0;
		int j = 2;
		
		for (int k = 1; k <= 25; k++) {

			numbers[i][j] = k;

			if (k % 5 == 0) {

				i++;
				continue;
			}

			i--;
			j++;

			if (i < 0)
				i = 4;

			if (j > 4)
				j = 0;

		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {

				System.out.print(numbers[i][j] + " ");

			}
			System.out.println(" ");

		}

	}

}