package practice;

public class CloestNumber {

	public static void cloestNumber(){
		
		//10개의 1자리 양의 정수를 입력 받아 배열에 저장한 후 저장된 자료 중 7에 가장 가까운 자료를 찾아라. 
		//단, 자료는 1자리 정수이고 근사값이 2개인 경우에는 나중에 찾은 값을 출력한다.
		//뺄셈한 값의 절대값이 가장 적은 것. 
		
		int[] numbers = new int [10];
		int smallestNumber = 0;
		
		for(int i = 0; i<numbers.length;i++){
			System.out.println("1자리 양의 정수를 입력하세요.");
			numbers[i] = Main.scan.nextInt();
			
		}
		
		for(int j = 0; j<numbers.length;j++){
			
			numbers[j] = Math.abs(numbers[j] -7);
			System.out.println(numbers[j]);
		}
		
		
		//최소값을 구하고자 한다.
		//비교를 해야 할 것 같아.
		//어떻게? 배열에 숫자들이 들어 있는데. 하니씩 비교해서 작은 수를 남기고 그 다음 수와 또 비교를 한다. 그렇게 배열끝까지 돌리면 가장 작은 수가 남겠지?
		//일단 첫번째 수와 두번째 수를 비교해야 하는데. 
		
		smallestNumber = numbers[0];
		for(int k = 0; k<numbers.length-1; k++){ // numbers의 길이에서 1을 뺀 수보다 작은 것들을 K에 +해가면서 구한다.

			if(smallestNumber > numbers[k+1]){ 
				
				smallestNumber = numbers[k+1];
				
			}
			
		}
		int num = 7-smallestNumber;
		System.out.println("가장 가까운 정수는 "+num+"입니다.");
		
	}
}
