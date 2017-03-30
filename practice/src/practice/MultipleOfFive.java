package practice;

public class MultipleOfFive {

	public static void multipleOfFive(){
		
		//1부터 100까지의 수 중 5의 배수의 개수와 합을 출력해라. 
		//
		
		int count = 0;
		int sum = 0;
		
		count = 100/5;
		
		for(int i = 0; i<count; i++){
			
			sum += 5*i;
			
		}
		
		System.out.println(sum);
	}
	
}
