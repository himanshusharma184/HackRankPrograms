package interview;

public class TreePathSum {

	public static void main(String[] args) {
		TreeNode left1 = new TreeNode(11);
		left1.left = new TreeNode(7);
		left1.right = new TreeNode(2);

		TreeNode left = new TreeNode(4);
		left.left = left1;
		TreeNode root = new TreeNode(5);
		root.left = left;

		TreeNode right = new TreeNode(8);
		root.right = right;
		right.left = new TreeNode(13);
		TreeNode rr = new TreeNode(4);
		rr.right = new TreeNode(1);
		right.right = rr;
		int a = 22;

		if (root.val == a) {
			System.out.println(true);
			return;
		} else {
			System.out.println(find(root, a));
		}

	}

	private static boolean find(TreeNode root, int a) {
		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null)
			return root.val == a ? true : false;
		else {
			return find(root.left, a - root.val)
					|| find(root.right, a - root.val);
		}

	}

}
