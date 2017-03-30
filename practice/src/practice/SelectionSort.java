package practice;

public class SelectionSort {

	public static void selectionSort() {

		// 10개의 수치 자료를 입력 받아 배열에 저장한 후 저장된 자료를 오름차순으로 정렬하는 순서도를 작성하라.

		int[] numbers = new int[10];

		for (int i = 10; i > 0; i--) {
			System.out.println(i + "개의 수치 자료를 입력해 주세요.");
			numbers[i - 1] = Main.scan.nextInt();

		}

		// 선택정렬이란 첫번째와 n번째를 비교하고 n번째가 작으면 바꾼다. 그 다음 번째 것과 비교를 해서 작으면 또 교환.
		// 바꾸는 것은 어떻게? temp 하나 만들어서 바꿔줌.
		
		int k = 1;
		
		for (int j = 0; j < numbers.length - 1; j++) {
			
			int temp = 0;
			//문제점: k가 이중포문 돌 때마다 적당값으로 바꿔줘야 함. 
			
			for (; k < numbers.length; k++) {

				if (numbers[j] > numbers[k]) { 
					temp = numbers[j];
					numbers[j] = numbers[k];
					numbers[k] = temp;

				}
			}
			
			k = 2+j;
		}
		for (int o = 0; o < numbers.length; o++) {
			System.out.print(numbers[o]);
			System.out.print(" ");
		}
	}

}
