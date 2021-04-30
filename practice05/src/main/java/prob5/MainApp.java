package prob5;

public class MainApp {

	public static void main(String[] args) {
		try {
			MyStack<String> stack = new MyStack<>(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				String s = (String)stack.pop();
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack<>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());	// exception
			
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
