package practice;

public class BinarySearch {

	static void binarySearch() {

		// 키보드로 입력 받은 값이 DATA배열의 몇 번째에 기억되어 있는지 알아보기 위해 출력하는 순서도를 작성하시오. 단,
		// DATA[10] 배열에는 10개의 숫자가 들어있으며,
		// 찾는 자료가 없을 경우 자료와 함께 "Not Found"를 출력하고 끝낸다.
		// 첫번째 자료와 마지막 자료의 위치를 더한 후 2로 나누면 중간위치가 나옴. 내림하고.
		// 중간위치의 수와 찾으려는 수를 비교하고 찾으려는 수가 더 크면 중간 위치와 마지막 위치를 더한 후 2로 나눔.
		// 찾으려는 수가 더 작은 경우에는 첫번째 위치와 중간위치 바로 전 수를 더한 후 2로 나눔.
		// 이 과정을 다 찾을 때까지 반복함. 다 찾을 때까지란?100이면 2의 6승 50이면 2의 5승

		int numbers[] = { 0, 50,100 };
		int number = 0;
		int firstNumber = 0;
		int lastNumber = 2;
		int middleNumber = 0;
		System.out.println("찾으려는 정수를 입력하세요.");
		number = Main.scan.nextInt();

		for (int i = 0; i < 6; i++) {

			if (firstNumber <= lastNumber) {//이걸 생각해내는게 어려웠음.

				middleNumber = (firstNumber + lastNumber) / 2;

				if (number == numbers[middleNumber]) {
					System.out.println("입력값: " + number + " 위치: " + (middleNumber + 1));
					break;
				} else if (number < numbers[middleNumber]) {

					lastNumber = middleNumber - 1;

				} else {

					firstNumber = middleNumber + 1;

				}

			} else {

				System.out.println("Not Found");
				break;

			}
		}
	}
}
