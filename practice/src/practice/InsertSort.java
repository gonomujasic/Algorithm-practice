package practice;

public class InsertSort {

	static void insertSort() {

		// 10개의 수치를 입력 받아 배열에 저장한 후 저장된 자료를 오름차순으로 정렬.
		// 처음엔 두번째와 첫번째를 비교해서 작은 것을 앞에
		// 두번째엔 두번째와 세번째를 비교하고 정렬하며, 그다음 첫번째와 두번째를 비교하고 정렬하낟.
		// 세번째엔 세번째와 네번째를 비교하고 정렬하며, 그다음 두번째와 세번째를 비교하고 정렬한다. 그다음 첫번째와 두번째를 비교하고
		// 정렬.
		// 작은 포문은 큰 포문 몇 번째 돌아갔는지에 따라 돌릴 횟수가 정해짐. 즉 j+1만큼 돌림. 작은 포문 돌릴 때마다 k를
		// -1씩 해줘야함.
		// 1포문은 몇번 도니? 2개일때 1번, 3개일 때 2번, 4개일 때 3번,
		// 2포문은 1포문 횟수에 따라 바뀌는 끝값에서부터 버블정렬.
		// 3포문은 두 값을 바꾸는 역할
		// 결론: 삽입정렬은 큰 포문과 작은 포문 두 개로 나뉘며, 큰 포문은 정렬의 회차를 나타낸다.
		//        작은포문은 버블정렬에 k값을 j에 연동시켜 주어 회차에 따라 추가되게 하여, 뒤에서부터 버블 정렬이 가능하도록 했다. 

		int[] numbers = new int[10];
		int temp = 0;

		for (int i = numbers.length; i > 0; i--) {

			System.out.println("정수를 " + i + "번 더 입력해주세요.");
			numbers[i-1] = Main.scan.nextInt();

		}

		for (int j = 0; j < numbers.length - 1; j++) {

			for (int k = j + 1; k > 0; k--) {
				
				if (numbers[k - 1] > numbers[k]) {
					temp = numbers[k - 1];
					numbers[k - 1] = numbers[k];
					numbers[k] = temp;
				} else {
					break;//한번이라도 못 바꾸면 브레이크 해주면 됨. 그 앞에 것들은 이미 정렬이 된 것이기 때문에. 
				}
			}
		}
		
		for(int o = 0; o < numbers.length; o++){
			System.out.print(numbers[o]);
			System.out.print(" ");
		}
	}
}
