package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		Arithmetic arithmetic = null;
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		if("+".equals(operation)) {
			arithmetic = new Add();
		} else if("-".equals(operation)) {
			arithmetic = new Sub();
		} else if("*".equals(operation)) {
			arithmetic = new Mul();
		} else if("/".equals(operation)){
			arithmetic = new Div();
		}
		
		int result = arithmetic.calculate(a, b);
		System.out.println(">> " + result);
	}
}
