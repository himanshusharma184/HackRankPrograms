package interview;

import java.util.Stack;

public class InorderTraversal {

	private static int counter = 1;

	public static void main(String[] args) {
		TreeNode left1 = new TreeNode(11);
		left1.left = new TreeNode(7);
		left1.right = new TreeNode(2);

		left1.left.left = new TreeNode(67);
		left1.right.right = new TreeNode(79);
		left1.left.right = new TreeNode(90);
		left1.right.left = new TreeNode(55);
		TreeNode left = new TreeNode(4);
		left.left = left1;
		TreeNode root = new TreeNode(5);
		root.left = left;

		TreeNode right = new TreeNode(8);
		root.right = right;
		right.left = new TreeNode(13);
		TreeNode rr = new TreeNode(4);
		right.right = rr;
		rr.right = new TreeNode(1);
		rr.left = new TreeNode(23);
		rr.left.left = new TreeNode(72);
		rr.left.right = new TreeNode(70);
		rr.right.left = new TreeNode(11);
		rr.right.right = new TreeNode(17);

		printInorder(root);
		System.out.println("now printing Inorder ----->");
		printPreOrder(root);
		System.out.println("now printing postOrder ----->");
		printPostOrder(root);

	}

	private static void printPostOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);

		System.out.println("node " + counter + "----> " + root.val);
		counter++;
	}

	private static void printPreOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		int counter = 1;

		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(root);
		while (!st.isEmpty()) {
			TreeNode node = st.pop();
			System.out.println("node " + counter + "----> " + node.val);
			counter++;
			if (node.right != null) {
				st.push(node.right);
			}
			if (node.left != null) {
				st.push(node.left);
			}
		}

	}

	private static void printInorder(TreeNode root) {
		if (root == null) {
			return;
		}
		int counter = 1;
		Stack<TreeNode> st = new Stack<TreeNode>();
		while (root != null || !st.isEmpty()) {
			if (root != null) {
				st.push(root);
				root = root.left;
			} else {
				TreeNode node = st.pop();
				System.out.println("node " + counter + "----> " + node.val);
				counter++;
				root = node.right;
			}

		}

	}
}
