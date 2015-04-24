package interview;

import java.util.Scanner;

public class RemoveDupNode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		LinkedListNode node = new LinkedListNode(0);
		int[] a1 = new int[a];
		for (int i = 0; i < a; i++) {
			a1[i] = scanner.nextInt();
		}
		LinkedListNode head = node.buildList(a1);

		LinkedListNode prev = head;
		LinkedListNode curr = prev.next;

		while (curr != null) {
			LinkedListNode runner = head;
			while (runner != curr) {
				if (runner.data == curr.data) {
					LinkedListNode temp = curr.next;
					prev.next = temp;
					curr = temp;
					break;
				}
				runner = runner.next;

			}
			if (runner == curr) {
				prev = curr;
				curr = curr.next;
			}
		}
		head.printList(head);
	}

}
