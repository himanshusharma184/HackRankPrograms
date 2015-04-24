package interview;

import java.util.Scanner;
import java.util.Stack;

public class StackSorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < size; i++) {
			s.push(scanner.nextInt());
		}

		Stack<Integer> t = new Stack<Integer>();
		while (!s.isEmpty()) {
			int temp = s.pop();
			while (!t.isEmpty() && t.peek() > temp) {
				s.push(t.pop());
			}
			t.push(temp);

		}
		while (!t.isEmpty()) {
			System.out.println(t.pop());
		}
	}

}
