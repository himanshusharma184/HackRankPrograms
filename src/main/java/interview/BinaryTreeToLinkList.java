package interview;

import java.util.Stack;

public class BinaryTreeToLinkList {

	public TreeNode getLinkList(TreeNode head) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode n = head;
		// stack.add(n);
		while (n != null || !stack.isEmpty()) {
			if (n.right != null) {
				stack.add(n.right);
			}
			if (n.left != null) {
				n.right = n.left;
				n.left = null;
			} else {
				if (!stack.isEmpty()) {
					TreeNode temp = stack.pop();
					n.right = temp;
				}
			}
			n = n.right;
		}
		return head;

	}
}
