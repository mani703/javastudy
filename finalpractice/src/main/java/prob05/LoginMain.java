package prob05;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		int password = scanner.nextInt();
	}

}
