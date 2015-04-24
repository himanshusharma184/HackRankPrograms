package interview;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTreeFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextInt();
		}
		Arrays.sort(s);
		TreeNode node = getTree(s, 0, a - 1);

		inOrder(node);

	}

	private static void inOrder(TreeNode node) {
		Stack<TreeNode> st = new Stack<TreeNode>();
		int counter = 1;
		while (node != null || !st.isEmpty()) {
			if (node != null) {
				st.push(node);
				node = node.left;
			} else {
				TreeNode temp = st.pop();
				System.out.println("node " + counter + "----> " + temp.val);
				counter++;
				node = temp.right;
			}
		}

	}

	private static TreeNode getTree(int[] s, int i, int j) {
		if (i > j) {
			return null;
		}
		int mid = (i + j) / 2;
		TreeNode node = new TreeNode(s[mid]);
		node.left = getTree(s, i, mid - 1);
		node.right = getTree(s, mid + 1, j);
		return node;
	}

}
