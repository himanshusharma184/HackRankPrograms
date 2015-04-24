package interview;

import java.util.*;

public class ReverseAndMergeLinkList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextInt();
		}
		LinkedListNode node = new LinkedListNode();

		LinkedListNode head = node.buildList(s);
		LinkedListNode slow = head;
		LinkedListNode fast = head;

		while (fast != null && fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		// reverse slow
		LinkedListNode prev = slow;
		LinkedListNode curr = prev.next;
		slow.next = null;
		while (curr != null) {
			LinkedListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}
		slow = null;

		// merge head and prev

		while (prev != null) {
			LinkedListNode temp1 = head.next;
			LinkedListNode temp2 = prev.next;
			head.next = prev;
			prev.next = temp1;
			head = temp1;
			prev = temp2;
		}

		node.printList(head);
	}

}
