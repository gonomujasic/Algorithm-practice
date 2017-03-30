package practice;

public class ArrayDiamond {

	static void arrayDiamond() {

		// 0 0 1 0 0
		// 0 2 3 4 0
		// 5 6 7 8 9
		// 0 10 11 12 0
		// 0 0 13 0 0

		
		//풀이
		//먼저 행은 쭉 진행하기로 하고
		//1행은 3번째 위치에서 시작해서 3번째 위치에서 끝남
		//2행은 2번째 위치에서 시작해서 4번째 위치에서 끝남
		//즉 한 단계씩 늘려주다가 3행에서 시작과 끝 위치를 하나씩 +-를 해주면 됨.  
		int[][] numbers = new int[5][5];
		int k = 1;
		int e = 2;
		int s = 2;
		for (int i = 0; i < 5; i++) {
			for (int j = s; j <= e; j++) {

				numbers[i][j] = k++;

			}

			if (i >= 2) {

				e--;
				s++;

			} else {

				e++;
				s--;

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
