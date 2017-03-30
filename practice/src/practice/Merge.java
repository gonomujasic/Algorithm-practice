package practice;

public class Merge {

	static void merge() {

		/*
		 * 1. 배열 A,B 에는 정수가 오름차순으로 정렬되어 있다. 2. 데이터는 10건 미만이다. 3. 배열 A,B에서 0이 들어
		 * 있는 다음의 요소에는 데이터가 없는 것으로 간주한다. 4. 배열 A,B를 병합시켜 배열 C에 기억시키고 맨 마지막에는 0을
		 * 기억시킨다. 5. 배열 A와 B에 같은 데이터가 있으면 한 번만 C에 옮긴다.
		 */

		// 1. 둘 다 넣은 후 정렬
		// 2. 하나씩 비교해서 작은 것부터 넣기.
		// 0처리를 어케 하나.
		
		//c랑 다름..

		int a[] = { 2, 3, 5, 8, 9, 10, 12, 13, 18, 0 };
		int b[] = { 1, 3, 5, 6, 10, 12, 17, 19, 20, 0 };
		int c[] = new int[20];
		int i = 0;
		int j = 0;
		int k = 0;
		while (true) {
			
			if (a[i] == 0 && b[j] == 0) {

				break;
				
			} else	if (a[i] == 0) {

				c[k] = b[i];
				j++;

			} else 	if (b[j] == 0) {

				c[k] = a[i];
				i++;

			} else	if (a[i] != 0 && b[j] != 0) {
				if (a[i] < b[j]) {

					c[k] = a[i];
					i++;

				} else if (a[i] > b[j]) {

					c[k] = b[j];
					j++;

				} else if (a[i] == b[j]) {

					c[k] = a[i];
					i++;
					j++;

				}
			}
			k++;
		}
		for (int o = 0; o < c.length; o++) {
			System.out.println(c[o] + " ");
		}
	}
}
