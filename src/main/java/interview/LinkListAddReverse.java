package interview;

import java.util.Scanner;

public class LinkListAddReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		LinkedListNode node = new LinkedListNode();
		LinkedListNode head = node.buildList(array);
		int[] sec = { 1, 5, 6, 7, 8, 8, 4, 6 };
		LinkedListNode head2 = node.buildList(sec);
		LinkedListNode res = new LinkedListNode();
		LinkedListNode temp=null;
		boolean first = true;
		int carry = 0;
		while (head != null || head2 != null) {
			int sum = carry;
			carry = 0;
			if (head != null) {
				sum += head.data;
				head = head.next;
			}
			if (head2 != null) {
				sum += head2.data;
				head2 = head2.next;
			}
			if (sum > 9) {
				carry++;
			}

			if (first) {
				res = new LinkedListNode(sum % 10);
				temp = res;
				first=false;
			} else {
				LinkedListNode pr = new LinkedListNode(sum % 10);
				if (temp == null) {
					temp = pr;
				}
				temp.next = pr;
				temp = pr;
			}

		}

		node.printList(res);
	}

}
