package practice;

public class CountPrimeNumber {

	public static void count() {
		// 배열 A[99]에 2~100사이의 정수를 기억시킨 후 이 배열을 이용하여 소수의 개수를 구하시오.
		// 배열을 선언한 후 배열에 값을 입력시킨다. for문 이용해 하나씩 넣어주면 될 듯.
		// 소수의 개수는 소수인지 파악한 후 소수이면 카운트 하는 방식.
		//배열의 각각의 값을 포문으로 돌려 소수인지 카운트.  

		int[] A = new int[99];
		int count = 0;
		for (int i = 0; i < 99; i++) {

			A[i] = i + 2;

		}
		
		for(int j = 0; j <A.length; j++){
			
			int k = 2;
			while(A[j] % k != 0)
				k++;
			
			if(A[j] == k){
				
				System.out.println(A[j] +"는 소수입니다.");
				count++;
				
			}
		}
		
		System.out.println("소수의 수: "+ count);
		
	}
	
	public static void count2(){
		//배열에 소수의 배수에 0을 채우고 0이 아닌 값만 추출하는 방식으로. 
		
		int[] A = new int[99];
		int count = 0;
		for (int i = 0; i < 99; i++) {

			A[i] = i + 2;

		}
		
		
	}
	
}
