package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int arr[] = new int[10];
		
		/* 코드 작성 */
		System.out.print("금액 : ");
		int num = scanner.nextInt();
		if(num >= MONEYS[0]) {
			arr[0] = num / MONEYS[0];
			arr[1] = (num % MONEYS[0] / MONEYS[1]);
			arr[2] = ((num % MONEYS[0]) % MONEYS[1]) / MONEYS[2];
			arr[3] = (((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) / MONEYS[3];
			arr[4] = ((((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) / MONEYS[4];
			arr[5] = (((((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) / MONEYS[5];
			arr[6] = ((((((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) / MONEYS[6];
			arr[7] = (((((((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) / MONEYS[7];
			arr[8] = ((((((((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = (((((((((num % MONEYS[0]) % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[0]) {
			arr[1] = num  / MONEYS[1];
			arr[2] = (num % MONEYS[1]) / MONEYS[2];
			arr[3] = ((num % MONEYS[1]) % MONEYS[2]) / MONEYS[3];
			arr[4] = (((num % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) / MONEYS[4];
			arr[5] = ((((num % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) / MONEYS[5];
			arr[6] = ((((num % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) / MONEYS[6];
			arr[7] = ((((((num % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) / MONEYS[7];
			arr[8] = (((((((num  % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = ((((((((num  % MONEYS[1]) % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[1]) {
			arr[2] = num / MONEYS[2];
			arr[3] = (num % MONEYS[2]) / MONEYS[3];
			arr[4] = ((num % MONEYS[2]) % MONEYS[3]) / MONEYS[4];
			arr[5] = (((num % MONEYS[2]) % MONEYS[3]) % MONEYS[4]) / MONEYS[5];
			arr[6] = ((((num % MONEYS[2]) % MONEYS[3]) % MONEYS[4]) % MONEYS[5]) / MONEYS[6];
			arr[7] = (((((num % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) / MONEYS[7];
			arr[8] = ((((((num % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = (((((((num % MONEYS[2]) % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[2]) {
			arr[3] = num / MONEYS[3];
			arr[4] = (num % MONEYS[3]) / MONEYS[4];
			arr[5] = ((num % MONEYS[3]) % MONEYS[4]) / MONEYS[5];
			arr[6] = (((num % MONEYS[3]) % MONEYS[4]) % MONEYS[5]) / MONEYS[6];
			arr[7] = ((((num % MONEYS[3]) % MONEYS[4]) % MONEYS[5]) % MONEYS[6]) / MONEYS[7];
			arr[8] = (((((num % MONEYS[3]) % MONEYS[4]) % MONEYS[5]) 
					% MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = ((((((num % MONEYS[3]) 
					% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[3]) {
			arr[4] = num / MONEYS[4];
			arr[5] = (num % MONEYS[4]) / MONEYS[5];
			arr[6] = ((num % MONEYS[4]) % MONEYS[5]) / MONEYS[6];
			arr[7] = (((num % MONEYS[4]) % MONEYS[5]) % MONEYS[6]) / MONEYS[7];
			arr[8] = ((((num % MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = (((((num% MONEYS[4]) % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[4]) {
			arr[5] = num / MONEYS[5];
			arr[6] = (num % MONEYS[5]) / MONEYS[6];
			arr[7] = ((num % MONEYS[5]) % MONEYS[6]) / MONEYS[7];
			arr[8] = (((num % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = ((((num % MONEYS[5]) % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[5]) {
			arr[6] = num / MONEYS[6];
			arr[7] = (num % MONEYS[6]) / MONEYS[7];
			arr[8] = ((num % MONEYS[6]) % MONEYS[7]) / MONEYS[8];
			arr[9] = (((num % MONEYS[6]) % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[6]) {
			arr[7] = num / MONEYS[7];
			arr[8] = (num % MONEYS[7]) / MONEYS[8];
			arr[9] = ((num % MONEYS[7]) % MONEYS[8]) / MONEYS[9];
		}
		if(num <= MONEYS[7]) {
			arr[8] = num / MONEYS[8];
			arr[9] = (num % MONEYS[8]) / MONEYS[9];
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(MONEYS[i]+"원 : " + arr[i] + "개");
			System.out.println();
		}
		
		scanner.close();
 	}
}