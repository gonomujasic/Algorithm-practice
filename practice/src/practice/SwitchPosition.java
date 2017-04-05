package practice;

public class SwitchPosition {

	static void switchPosition() {

		// A[10]의 배열에는 첫 번째 위치부터 특정 번째까지 0이 아닌 자연수가 들어 있고, 나머지는 0이 들어있다.
		// 처음으로 0이 나오기 전까지의 숫자들의 위치를 반대로 교환하여 출력하라.
		// 예를들어 1234500000이면 5432100000으로 출력

		int[] numbers = new int[] { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };
		int[] numbers2 = new int[10];
		// 포문 돌려서 0이 처음 나오면 몇 번 돌았는지를 기억하고. 다시 돌려야 하나?
		// 다른 방법은? 한 번에 할 수 있는 방법은?
		// 배열을 하나 더 만들어서 0이 나올 때까지 돌리면서 xxx
		// 배열의 끝에서부터 돌아서 0이 아닌게 나오면 그때부터 기억시킴. 이게 젤 나은 듯.

		int j = 0;

		for (int i = numbers.length - 1; i >= 0; i--) {

			if (numbers[i] != 0) {
				numbers2[j] = numbers[i];
				j++;
			}
		}

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers2[i]);

		}

	}

	static void switchPosition2() {// 책풀이

		int[] numbers = new int[] { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };
		// 먼저 0이 나오는데를 파악하고 그 전까지의 수들을 교체함.
		int middleNum = 0;
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				j = i - 1;
				break;
			}
		}

		middleNum = j / 2;
		i = 0;
		while (true) {

			if (i == middleNum || j == middleNum) {
				break;
			}

			temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;

			i++;
			j--;

		}

		for (int o = 0; o < numbers.length; o++) {

			System.out.print(numbers[o]);

		}

	}

}
