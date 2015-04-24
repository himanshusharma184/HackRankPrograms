package interview;

public class ValidateBST {

	public static void main(String[] args) {
		validate(new TreeNode(67), Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean validate(TreeNode n, int min, int max) {
		if (n == null) {
			return true;
		} else if (n.val <= min || n.val >= max) {
			return false;
		} else {
			return (validate(n.left, min, n.val))
					&& validate(n.right, n.val, max);
		}
	}

}
