package practice;

public class ChangeNotation {

	public static void changeNotation(){
		
		//10자리 2진수를 입력 받아 10진수로 변환하여 출력하는 순서도를 작성
		//단, 10자리 2진수는 문자열로 되어 있고, 5번째 자리까지는 소수 이상이고, 6번째 자리부터는 소수점자리이다. 
		//11111.11111
		//2의 4승, 2의 3승, 2의 2승, 2의 1승, 2의 0승, 2의 -1승, 2의 -2승, 2의 -3승, 2의 -4승,2의 -5승 
		//2진수를 입력은 어떻게 받을 것인가? 1. 배열로 하나씩 넣도록 2. double 에 한번에 입력하도록
		//어차피 처리하려면 배열에서 하나씩 뽑아서 봐야 하므로 배열로 받자. 
		//.은 어떻게 할 것인가. 생략하고 받자. 
		
		String binary;
		double num;
		System.out.println("정수입력:");
		binary = Main.scan.next();
		System.out.println(binary.substring(0, 1));
		
	}
}
