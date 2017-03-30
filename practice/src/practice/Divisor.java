package practice;

import java.util.ArrayList;

public class Divisor {

	public static void divisor(){
		//정수를 입력받아 약수를 구해 출력하라. 
		//약수란 어떤 수 x를 1부터 x까지 차례대로 나누어 나머지가 0이 되게 하는 제수들이 약수이다.
		int num;
		ArrayList divisor = new ArrayList<>();
		
		System.out.println("정수를 입력하세요.");
		num = Main.scan.nextInt();
		
		for(int i = 1; i <= num; i++){
			if(num%i == 0){
				divisor.add(i);
			}
		}
		System.out.print(num + "의 약수는:");
		for(int j = 0; j<divisor.size(); j++){
			
			System.out.print(" "+ divisor.get(j));
				
		}
		System.out.println(".");
	}
}
