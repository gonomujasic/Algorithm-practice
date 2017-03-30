package practice;

public class FindingRanking {

	static void findingRanking() {

		// 10명의 학생에 대한 중간고사 점수의 석차를 구하는 순서도를 작성하시오.
		// 다 1로 놓고 첫번째 점수보다 높은 점수가 있을 경우 ranking의 숫자를 높여 석차를 낮춰주면 됨.
		// 점수가 같을 경우에는? 1. 석차 안 떨어짐. 이게 맞을듯.
		// 자기자신과의 비교의 경우..
		int[] numbers = new int[10];
		int[] ranking = new int[10];
		int number = 0;
		int i = 0;
		while (i < numbers.length) {
			System.out.println(i + 1 + "번째 학생의 중간고사 점수를 입력하세요.");
			number = Main.scan.nextInt();

			if (number >= 0 && number <= 100) {
				numbers[i] = number;
				ranking[i] = 1;
				i++;
			}
		}

		System.out.print("점수: ");
		for (int j = 0; j < numbers.length; j++) {

			for (int k = 0; k < numbers.length; k++) {

				if (numbers[j] < numbers[k]) {
					ranking[j]++;
				}
			}
			System.out.print(numbers[j] + " ");
		}
		System.out.println("");
		System.out.print("석차: ");

		for (int o = 0; o < numbers.length; o++) {
			System.out.print(ranking[o] + "   ");
		}
	}

	static void rightPrint() {

		// 10명 학생의 국어, 수학 점수를 각각 입력 받아 총점을 계산한 후 총점 기준 내림차순으로 순위를 출력하라. 총점이 0인
		// 경우에는 출력하지 않음.
		int[] language = new int[10];
		int[] math = new int[10];
		int[] numbers = new int[10];
		int[] ranking = new int[10];
		int temp = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println(i+1 + "번째 학생의 국어점수를 입력하세요. ");
			language[i] = Main.scan.nextInt();
			System.out.println(i+1 + "번째 학생의 수학점수를 입력하세요. ");
			math[i] = Main.scan.nextInt();
			numbers[i] = language[i] + math[i];
			
			ranking[i] =1;
		}
		//내림차순으로 정렬
		//정렬방식은? 
		
		//순위설정
		for(int j = 0; j <10; j++){
			
			for(int k = 0; k <10; k++){
				
				if(numbers[j] <numbers[k]){
					temp = numbers[k];
					
					
					ranking[j]++;
					
				}
			}
			
		}
		
		
		
	}

}
