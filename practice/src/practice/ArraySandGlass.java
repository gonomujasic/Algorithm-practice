package practice;

public class ArraySandGlass {

	static void sandGlass(){
		
		//모래시계 모양으로 배열하라.
		
		int[][] numbers = new int[5][5];
		int k = 1;
		int o = 0;
		int e = 5;
		
		for(int i = 0; i <5 ; i++){
			
			for(int j =o; j != e ;j++ ){
				
				numbers[i][j] = k++;
				
			}
			
			if(i >=2){
				
				o--;
				e++;
				
				
			} else{
				
				o++;
				e--;
				
			}
			
		}
				
		for(int i = 0; i <5 ; i++){
			for(int j = 0; j <5 ; j++){
				
				System.out.print(numbers[i][j]);
				
			}
			System.out.println(" ");
		}
	}
	
	
}
