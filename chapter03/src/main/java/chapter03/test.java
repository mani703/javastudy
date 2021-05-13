package chapter03;

public class test {

	public static void main(String[] args) {
		for(int i = 0; i < 9 ; i++) {
			int random = ( int )( Math.random() * 81 ) + 1;
			System.out.print(random + " ");
		}
	}

}
