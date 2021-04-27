package prob2;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			for(int j = 0; j < arr.length; j++) {
				arr[j] += 1;
			}
		}
	}
}

