package interview;

import java.util.Scanner;

public class PrintLinkListReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = scanner.nextInt();
		}
		LinkedListNode node = new LinkedListNode();
		LinkedListNode head = node.buildList(s);
		int val = head.data;

		reverse(head.next);

		System.out.println(val);
	}

	private static void reverse(LinkedListNode next) {
		if (next == null) {
			return;
		}
		reverse(next.next);
		System.out.print(next.data + " ");
	}

}
