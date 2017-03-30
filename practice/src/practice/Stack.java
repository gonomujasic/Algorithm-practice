package practice;

public class Stack {

	static void stack() {

		// 10개의 요소를 갖는 1차원 배열을 스택으로 이용하는 순서도를 작성하시오. 입력되는 데이터가 스택의 크기보다 커지면
		// "Overflow"를 출력하고,
		// 제거할 데이터가 없으면 "Underflow"를 출력

		int[] numbers = new int[10];
		int number = 0;
		String y;
		int i = 0;

		while (true) {
			System.out.print("현재 스택: ");
			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[j] + " ");
			}

			System.out.println(" ");
			System.out.println("값을 넣으려면 y를 값을 제거하려면 그 외의 키를 눌러주세요.");
			y = Main.scan.next();

			if (y.equals("y")) {

				System.out.println("값을 입력하세요.");
				number = Main.scan.nextInt();
				if (i < 5) {
					numbers[i] = number;
					i++;
				} else {
					System.out.println("OverFlow");

				}
			} else {
				if (i > 0) {
					System.out.print((i));
					System.out.println("번째 값을 제거합니다.");
					numbers[i - 1] = 0;
					i--;
				} else {
					System.out.println("UnderFlow");

				}
			}
		}
	}
}
