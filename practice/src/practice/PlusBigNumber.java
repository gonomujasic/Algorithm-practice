package practice;

public class PlusBigNumber {

	public static void plusBigNumber() {

		// 100건 이내의 12자리로 구성된 숫자를 더하는 순서도를 작성하시오. 단, 12자리의 숫자는 각 자리가 분리되어 배열에
		// 입력된다. 예를 들어 999,999,999,999라면
		// 000000000000와 같이 입력된다. 단, 배열의 첫 번째 요소로 0을 입력 받으면 계산 후 결과를 출력하고 프로그램을
		// 종료한다.
		// 단, 결과값이 들어갈 배열에는 초기 값으로 0이 들어 있다고 가정한다.

		// 자릿수,
		int number = 0;
		int[] numbers = new int[12];
		int digit = 0;
		System.out.println("12자리 정수를 입력해주세요.");
		while(true){
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = Main.scan.nextInt();
			
			
			
		}
		
		}
	}

}
