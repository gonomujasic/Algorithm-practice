package practice;

import java.util.Scanner;

public class SumOfPrimeNumber {

	static Scanner scan = new Scanner(System.in);

	public static void sumOfPrimeNumber() {
		// 값을 입력받고, 그 값까지에 존재하는 소수들을 합해라.
		// 소수를 구하고 그 값을 누적시킬 변수에 저장.
		// 소수란 1을 제외하고, 자기자신을 제외한 다른 수로 나누어 떨어지지 않는 수.
		// 2부터 쭉 나눠서 해당 값까지 나눠서 떨어지지 않는 경우엔 소수임.
		// 소수를 구하는 알고리즘을 반복하면 되는 건데, 반복은 소수의 개수만큼.
		// 소수의 개수는 어떻게 구하나. 와일문으로 처리하면 가능. if에 num이 제수랑 같을 때 break해주면 됨.
		// 시나리오를 작성해보자. 10을 입력한다. 2부터 10까지의 돌리면서 소수가 있는지 체크한다.
		// 그러면 2,3,5,7의 소수들이 각각 구해지고 그 소수들이 더해져야 한다.
		// 소수구하는 방법은 나누어떨어지는 경우로 구함.
		// 나누어 떨어지는 방법은 해당 숫자가 나누어 떨어지는 경우가 해당 숫자에 의해서만 나누어 떨어지면 됨.

		System.out.println("정수를 입력하세요.");
		int num = scan.nextInt();
		int sum = 0;

		for (int i = 2; i <= num; i++) {
			
			int j = 2;
			
			while (i % j != 0) 
				j++;
				
				if (i == j) {
					System.out.println(i + "는 소수입니다.");
					sum += i;
				}			
		}
		System.out.println("합계:"+ sum);
	}
}