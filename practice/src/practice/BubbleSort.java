package practice;

public class BubbleSort {

	public static void bubbleSort() {

		// 배열에 기억된 10건의 자료를 오름차순으로 정렬하는 순서도를 작성하시오.
		// 버블정렬이란 첫수와 두번째 수를 비교하여 바꾸고, 두번째수를 세번째수와 비교하여 바꿈.

		int[] numbers = new int[10];

		for (int i = 10; i > 0; i--) {

			System.out.println("정수를 " + i + "번 더 입력해주세요.");
			numbers[i - 1] = Main.scan.nextInt();

		}
		// 두개의 포문이 돌아가야 함. 작은 포문은 1과 2를 비교 바꾸고, 2와 3을 비교 바꾸고 끝까지 쭉. 큰 포문은 다시
		// 돌게끔. 그러면 큰 포문은 5개면 몇 번 돌아야 하나. 2개면 1번.
		// 3개면 2번, 4개면 3번 n-1번.
		int temp = 0;
		boolean runIs = false;
		for (int j = 0; j < numbers.length - 1; j++) {

			for (int k = 0; k < numbers.length - 1; k++) {
				// 중간에 한 싸이클 동안 바뀐 것이 없으면 종료되도록 만들어라.
				// 바뀌는게 없는지 어떻게 알 것인가? n+1번째가 항상 더 크면 됨.
				if (numbers[k] > numbers[k + 1]) {
					temp = numbers[k + 1];
					numbers[k + 1] = numbers[k];
					numbers[k] = temp;
					runIs = true;
				}

			}
			if (runIs == false) {
				break;
			}
			runIs = false;
		}

		for (int o = 0; o < numbers.length; o++) {
			System.out.print(" ");
			System.out.print(numbers[o]);
		}

	}

	public static void switchBubbleSort() {

		int[] numbers = new int[10];

		for (int i = 10; i > 0; i--) {

			System.out.println("정수를 " + i + "번 더 입력해주세요.");
			numbers[i - 1] = Main.scan.nextInt();

		}

		// 버블 정렬 기법을 응용하여 한 번은 왼쪽에서 오른쪽으로 진행하면서 최대값을 우측으로 보내고,
		// 한 번은 오른쪽에서 왼쪽으로 진행하면서 최소값을 좌측으로 보내는 방법을 반복하라.
		// 3자리면 543 왼1번 435 오1번 345 총2번 4자리면 5432 왼1번 4325 오1번 2435 왼1 2345 총3번
		// 5자리면 54321 왼1번 43215 오1번 14325 총4번
		// 왼쪽에서 한 차례하면 오른쪽에서는 맨끝에 자리는 정렬되어있으므로 할 필요 없이 끝에서 두번째부터 정렬함.
		int left = 0;
		int right = numbers.length - 1;
		int temp = 0;
		int shift = 0;

		while (left < right) {

			for (int k = left; k < right; k++) {

				if (numbers[k] > numbers[k + 1]) {

					temp = numbers[k];
					numbers[k] = numbers[k + 1];
					numbers[k + 1] = temp;
					shift = k;
				}

			}
			right = shift;

			for (int k = right; k > left; k--) {

				if (numbers[k - 1] > numbers[k]) {
					temp = numbers[k - 1];
					numbers[k - 1] = numbers[k];
					numbers[k] = temp;
					shift = k;
				}
			}
			left = shift;
		}

		for (int o = 0; o < numbers.length; o++) {
			System.out.print(" ");
			System.out.print(numbers[o]);
		}
	}
}
