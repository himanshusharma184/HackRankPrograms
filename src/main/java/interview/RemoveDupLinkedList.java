package interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		LinkedListNode node = new LinkedListNode();

		LinkedListNode head = node.buildList(b);
		System.out.println(" dup");
		node.printList(head);
		System.out.println();
		LinkedListNode prev = head;
		LinkedListNode cur = prev.next;
		Set<Integer> set = new HashSet<Integer>();
		set.add(head.data);
		while (cur != null) {
			if (set.contains(cur.data)) {
				prev.next = cur.next;
				cur = cur.next;
			} else {
				set.add(cur.data);
				prev = cur;
				cur = cur.next;
			}

		}
		System.out.println("no dup");
		node.printList(head);
	}

}
