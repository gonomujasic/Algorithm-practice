package practice;

import java.util.ArrayList;

public class PrimeFactor {

	public static void primeFactor(){
		//소인수란 어떤 수를 구성하는 인수 중에서 소수인 것. 
		//소인수분해는 소수를 이용하여 그 수를 만드는 곱의 형태로 표현하는 것. 
		//약수를 구한 뒤 그 약수에서 소수를 구하고 그 소인수들을 소인수분해해야 함. 
		//어떤 수 x를 소인수 분해 하려면 x를 2부터 차례대로 x의 제곱근까지의 숫자로 나누어 떨어지는지 검사함. 제곱근으로 나누어 떨어지면 x가 소인수임. 
		//나누어 떨어지면 몫을 다시 2부터 몫까지 차례로 나눠서 나누어 떨어질 때까지 나눔. 몫으로 나누어 떨어지면 그 몫이 소인수임. 
		//소인수들을 저장해 출력하면 끝~
		
		int num;
		int value;
		ArrayList primeNumber = new ArrayList<>();
		System.out.println("정수를 입력하세요.");
		
		num = Main.scan.nextInt();
		value = num;
		
		for(int i = 2; i <= num; i++){
			if(value%i==0){
				System.out.println("소수는 "+ i +"입니다.");
				primeNumber.add(i);
				value = value/i;
				i = 1;
			}
		}
		
		System.out.print("소인수들은 다음과 같다.");
		for(int j = 0; j < primeNumber.size(); j++){
			System.out.print(" " + primeNumber.get(j));
		}
	}
}
