package interview;

import java.util.Stack;

public class TreeToLinkList {

	private static int counter = 1;

	private static void printPostOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println("node " + counter + "----> " + root.val);
		counter++;
		printPostOrder(root.left);
		printPostOrder(root.right);

	}

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
		TreeNode node = root;
		Stack<TreeNode> st = new Stack<TreeNode>();
		while (node != null || !st.isEmpty()) {
			if (node.right != null) {
				st.push(node.right);
			}
			if (node.left != null) {
				node.right = node.left;
				node.left = null;
			} else if (!st.isEmpty()) {
				TreeNode temp = st.pop();
				node.right = temp;
			}
			node = node.right;
		}
		printPostOrder(root);
	}
}
