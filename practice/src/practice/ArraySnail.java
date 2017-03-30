package practice;

public class ArraySnail {

	static void arraySnail(){
		
		// 1   2   3   4  5
		// 16 17 18 19  6   
		// 15 24 25 20  7
		// 14 23 22 21  8
		// 13 12 11 10  9
		
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
	}
}
