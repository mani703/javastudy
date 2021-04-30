package prob5;

public class MyStack<T> {
	private T[] data;
	private int top = 0;

	public MyStack(int size) {
		data = (T[])new Object[size];
	}

	public void push(T data) {
		if(top == this.data.length) {
			resize(this.data.length);
		}
		this.data[top++] = data;
		
	}

	public T pop() throws MyStackException{
		top--;
		if(top == -1) {
			throw new MyStackException();
		}	
		return data[top];
		
	}

	public void resize(int size) {
		T[] tmp = data;
		this.data = (T[])new Object[size * 2];
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