package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		String s = scanner.nextLine();

		String[] str = s.split(" ");

		int lValue = Integer.parseInt(str[0]);
		int rValue = Integer.parseInt(str[1]);
		int length = str.length;

		char oper = str[length-1].charAt(0);
		if (oper == '+') {
			Arithmetic atm = new Add();
			System.out.println(atm.calculate(lValue, rValue));
		} else if(oper == '-') {
			Arithmetic atm = new Sub();
			System.out.println(atm.calculate(lValue, rValue));
		} else if(oper == '*') {
			Arithmetic atm = new Mul();
			System.out.println(atm.calculate(lValue, rValue));
		} else {
			Arithmetic atm = new Div();
			System.out.println(atm.calculate(lValue, rValue));
		}
	}

}
