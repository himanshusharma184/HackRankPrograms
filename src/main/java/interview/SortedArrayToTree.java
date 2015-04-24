package interview;

public class SortedArrayToTree {

	public TreeNode BST(int[] a, int i, int j) {
		if (i > j) {
			return null;
		}
		int mid = (i + j) / 2;

		TreeNode node = new TreeNode(a[mid]);
		node.left = BST(a, 0, mid - 1);
		node.right = BST(a, mid + 1, j);

		return node;

	}

}
