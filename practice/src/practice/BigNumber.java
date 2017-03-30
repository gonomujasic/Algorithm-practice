package practice;

public class BigNumber {

	public static void bigNumber() {
		// 10개의 수를 입력 받아서 가장 큰 수를 찾는 것.
		// 가장 큰 수를 찾기만 하면 되므로 첫번째 수랑 두번째 수를 비교하고 큰 수를 저장 그리고 세번째랑 비교 저장.
		int[] numbers = new int[10];
		int bigNumber = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("숫자를 입력하세요.");
			numbers[i] = Main.scan.nextInt();

		}

		bigNumber = numbers[0];

		for (int j = 0; j < numbers.length; j++) {

			if (bigNumber < numbers[j + 1]) {
				bigNumber = numbers[j + 1];
			}
		}

		System.out.println(bigNumber);

	}

	public static void ave() {

		// 7명의 채점 점수 중에서 최하위 점수와 최상위 점수를 제외한 5명의 점수의 평균을 구해라.
		// 최대값 최소값이 중복되면? 한명만 빼보자.
		// 최대값, 최소값 구한 뒤 배열에서 빼주는데 어떻게? 그냥 삭제하는 방식은 중복되는 경우에도 다 삭제 됨.
		// 최대값, 최소값 구할 때 중복되는 숫자가 있는지 확인 후

		int[] points = { 90, 80, 70, 60, 50, 100, 50 };
		int bigestNumber = points[0];
		int smallestNumber = points[0];
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < points.length-1; i++) {

			if (bigestNumber < points[i + 1]) {

				bigestNumber = points[i + 1];

			}

			if (smallestNumber > points[i + 1]) {

				smallestNumber = points[i + 1];

			}
		}
		
		for(int j = 0; j < points.length; j++){
			
			sum += points[j];
			
		}
		sum = sum - bigestNumber - smallestNumber;
		avg = sum/(points.length-2);
		System.out.println("최대, 최소점 제외 평균:"+avg);
	}
}
