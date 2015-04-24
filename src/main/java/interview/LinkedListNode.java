package interview;

public class LinkedListNode {
	
	int data;
	LinkedListNode next;

	public LinkedListNode(int i) {
		data = i;
		next = null;
	}

	public LinkedListNode() {

	}

	public LinkedListNode buildList(int[] a) {
		LinkedListNode prev = new LinkedListNode(a[0]);
		LinkedListNode head = prev;
		for (int j = 1; j < a.length; j++) {
			LinkedListNode next = new LinkedListNode(a[j]);
			prev.next = next;
			prev = prev.next;
		}
		return head;
	}

	public void printList(LinkedListNode next) {
		while (next != null) {
			System.out.println(next.data);
			next = next.next;

		}
	}

}
