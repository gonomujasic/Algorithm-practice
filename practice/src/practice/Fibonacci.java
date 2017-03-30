package practice;

public class Fibonacci {

	public static void fibo(){
		
		//1+1+2+3+5+8+13...의 합계
		//  0  1  1  2  3  5  
		//앞의 두 수를 더한 값. 
		//총계:sum, 두값:i j, 더한값을 i에 넣어주고 i는 sum에 넣은 후, 
		
		int i = 1;
		int j = 1;
		int k = 0;
		int sum = 2;
		int cnt = 0;
		
		for(cnt = 2; cnt<20;cnt++){
			
			k = i+j;
			sum += k;
			j = i;
			i = k;
		}
		
		System.out.println(sum);
		
		
	}
	
}
