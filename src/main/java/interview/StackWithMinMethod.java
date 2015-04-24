package interview;

import java.util.Scanner;
import java.util.Stack;

public class StackWithMinMethod {
	private Stack<Integer> s = new Stack<Integer>();
	private Stack<Integer> t = new Stack<Integer>();

	public void push(int v) {
		if (v <= min()) {
			s.push(v);
		}
		t.push(v);

	}

	public int pop() {
		int v = t.pop();
		if (v == s.peek()) {
			s.pop();
		}
		return v;

	}

	public int min() {
		if (s.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s.peek();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		StackWithMinMethod s = new StackWithMinMethod();
		for (int i = 0; i < size; i++) {
			s.push(scanner.nextInt());
		}
		System.out.println(s.min());
	}

}
