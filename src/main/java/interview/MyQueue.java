package interview;

import java.util.Stack;

public class MyQueue<T> {

	Stack s1, s2;

	public MyQueue() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}

	public void push(int i) {
		s1.push(i);
	}

	public T pop() {
		if (!s2.isEmpty()) {
			return (T) s2.pop();
		} else {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return (T) s2.pop();

	}

	public T peek() {

		if (!s2.isEmpty()) {
			return (T) s2.peek();
		} else {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return (T) s2.peek();

	}

	public static void main(String[] args) {

	}

}
