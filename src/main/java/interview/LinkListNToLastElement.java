package interview;

import java.util.Scanner;

public class LinkListNToLastElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();

		int[] array = new int[a];
		for (int i = 0; i < a; i++) {
			array[i] = scanner.nextInt();
		}
		LinkedListNode node = new LinkedListNode();
		LinkedListNode head = node.buildList(array);
		LinkedListNode ahead = head;
		node = head;
		for (int i = 0; i < n - 1; i++) {
			if (ahead.next == null) {
				System.out.println("Insufficient node to traverse");
				System.exit(0);
			} else {
				ahead = ahead.next;
			}
		}
		if (ahead.next == null) {
			System.out.println(head.data + "  is the nth node from last");
			System.exit(0);
		}
		while (ahead.next != null) {
			head = head.next;
			ahead = ahead.next;
		}
		System.out.println(head.data + "  is the nth node from last");
		System.exit(0);

	}

}
