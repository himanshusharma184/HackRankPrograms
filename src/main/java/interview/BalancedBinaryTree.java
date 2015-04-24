package interview;

public class BalancedBinaryTree {
	public TreeNode getTree() {
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
		return root;
	}

	public static void main(String[] args) {
		TreeNode node = new BalancedBinaryTree().getTree();
		if (node == null) {
			System.out.println("not a balanced tree");
			return;
		}

		if (findBalanceTree(node) == -1) {
			System.out.println("not a balanced tree");
			return;
		}
		System.out.println(" balanced tree");
	}

	private static int findBalanceTree(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = findBalanceTree(node.left);
		int right = findBalanceTree(node.right);
		if (left == -1 || right == -1) {
			return -1;
		}
		if (Math.abs(left - right) > 1) {
			return -1;
		}
		return Math.max(left, right) + 1;
	}
}
