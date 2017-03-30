package practice;

import java.util.Scanner;

public class GreatestCommonDivisor {

	static Scanner scan = new Scanner(System.in);
	
	public static void gcd(){
		//최대공약수를 구하고 정수1과 정수2의 곱을 최대공약수로 나누면 최소공배수.
		//최대공약수를 구하는 방식은 큰값을 작은값으로 나누고, 그 결과가 나누어 떨어진다면 그 작은값이 최대공약수이다.
		//나누어 떨어지지 않는다면 그 나머지로 작은값을 나눈다. 그랬는데도 또 나누어 떨어지지 않으면 나누어 떨어질 때까지 반복한다. 
		int gcd = 0;
		int lcm = 0;
		int bigNumber = 0;
		int smallNumber = 0;
		int temp = 0;
		
		System.out.println("첫 정수 입력:");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2 = scan.nextInt();

		if(num1>=num2){
			bigNumber = num1;
			smallNumber = num2;			
		} else {
			bigNumber = num2;
			smallNumber = num1;
		}
		
		while(true){//최대공약수 구함.
			if(bigNumber % smallNumber == 0){
				gcd = smallNumber;
				System.out.println("최대공약수는 "+gcd +"입니다.");
				break;
			} else{
			
			temp = smallNumber;
			smallNumber = bigNumber % smallNumber;
			bigNumber = temp;
			
			}
		}
		
		lcm = num1*num2/gcd;
		
		System.out.println("최소공배수는 "+ lcm +"입니다.");
		
	}
}