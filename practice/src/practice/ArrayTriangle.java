package practice;

public class ArrayTriangle {

	static void arrayTriangle() {

		int numbers[][] = new int[5][5];
		int k = 1;
		int o = 1;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < o; j++) {//o 를 i 로 바꾸면 더 좋게 바꿀 수 있음. o는 필요없었음..ㅠㅠㅠㅠㅠ

				numbers[i][j] = k++;

			}
			o++;
		}
		
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(numbers[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	static void arrayReverseTriangle(){
		
		int numbers[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			
			for(int j = 4-i; j <= 4 ; j++) {

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
	
	static void arrayTriangleFromRight(){
		
		int numbers[][] = new int[5][5];
		int k = 1;
		
		for (int i = 0; i <= 4; i++) {
			
			for(int j = i; j >= 0 ; j--) {//초기값은 위치해야 하는 곳으로 잡아주고, 위치해야 하는 데서 방향에 따라 +와 -로 정해주고, 몇번 돌릴지를 정한다. 

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
	
}
