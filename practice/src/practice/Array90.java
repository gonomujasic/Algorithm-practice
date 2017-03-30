package practice;

public class Array90 {

	static void array90() {

		// 배열에 A와 같이 입력한 후 90도 회전한 결과를 배열 B에 이동하는 순서도를 작성하라.

		// 11 12 13 14 15
		// 0 7 8 9 10
		// 0 0 4 5 6
		// 0 0 0 2 3
		// 0 0 0 0 1

		// 0 0 0 0 11
		// 0 0 0 7 12
		// 0 0 4 8 13
		// 0 2 5 9 14
		// 1 3 6 10 15

		int[][] numbers = new int[5][5];
		int k = 1;
		
		for (int i = 4; i >= 0; i--) {

			for (int j = i; j <= 4; j++) {

				numbers[i][j] = k++;
				
			}
			
		}

		for(int i = 0; i<5; i++){//원래값
			for(int j = 0; j < 5; j++){
				
				System.out.print(numbers[i][j]+" ");
				
			}
			System.out.println(" ");
			
		}
		
		System.out.println("");
		
		for(int i = 0; i<5; i++){//바꾼값
			for(int j = 4; j >= 0; j--){
				
				System.out.print(numbers[j][i]+" ");
				
			}
			System.out.println(" ");
			
		}
		
	
	}

}
