package practice;

import java.util.Scanner;

public class PrimeNumber {

	static Scanner scan = new Scanner(System.in);

	public static void notDivide() {
		// 나누어 떨어지지 않을 때. 2부터 해당 수 직전 정수까지 나누어서 떨어지지 않는다면 정수이다.
		// 입력 받은 값 을 2부터 그 전값까지 다 나눠봄. 나눠서 나머지가 0인 경우가 나오면 멈추고 소수라고 판별 해줌.

		System.out.println("정수를 입력하세요.");
		int num = scan.nextInt();
		boolean isFalse = false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				System.out.println(num + "는 소수가 아닙니다.");
				isFalse = true;
				break;
			}
		}

		if (!isFalse) {
			System.out.println(num + "는 소수입니다.");
		}
	}

	public static void divide() {
		// 나누어 떨어지는 경우. 2부터 쭉 나누는데, 나누어 떨어지는 최초수가 제수와 같을 경우 소수이다.
		System.out.println("정수를 입력하세요.");
		int num = scan.nextInt();
		int i = 2;
		while(num%i != 0)
			i++;
		
			if (i == num) {
				System.out.println(num + "는 소수입니다.");
				
			} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
	}
	
	public static void square(){
		//2부터 쭉 나누는데 제곱근으로 나눠지면 소수다. 
		//제곱근까지의 수 중 한 개의 수에 대해서라도 나누어 떨어지면 소수가 아님. 
		System.out.println("정수를 입력하세요.");
		int num = scan.nextInt();
		
		int integer =(int) Math.sqrt(num);
		
		for(int i = 2; i <integer; i++){
			
			if(num % i == 0){
				System.out.println("소수아님");
				break;
			}
			
		}
		
	}
}
