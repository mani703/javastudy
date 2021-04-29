package prob5;

public class MyStack {
	private String[] data;
	private int top = 0;

	public MyStack(int size) {
		data = new String[size];
	}

	public void push(String data) {
		if(top == this.data.length) {
			resize(this.data.length);
		}
		this.data[top++] = data;
		
	}

	public String pop() throws MyStackException{
		top--;
		if(top == -1) {
			throw new MyStackException();
		}	
		return data[top];
		
	}

	public void resize(int size) {
		String[] tmp = data;
		this.data = new String[size * 2];
		for(int i = 0; i < size; i++) {
			this.data[i] = tmp[i];
		}
	}

	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		return false;
	}
}