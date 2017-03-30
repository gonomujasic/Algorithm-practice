package practice;

public class Factorial {

	public void facto() {

		//1!+2!+3!...의 합을 보여라
		//1+(2*1)+(3*2*1)
		//1   2*     6*    24*
		// 2배   3배   4배 
		int i;
		int j = 1;
		int k = 0;

		for(i = 1; i<=10; i++){ 
			
			j *= i;
			k += j;
			
		}
		
		System.out.println(k);
	}

}
