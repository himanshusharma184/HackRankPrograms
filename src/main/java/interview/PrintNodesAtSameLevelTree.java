package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintNodesAtSameLevelTree {
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

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		List<Integer> list = new ArrayList<Integer>();
		while (!queue.isEmpty()) {
			TreeNode n = queue.poll();
			list.add(n.val);
			if (n.left != null) {
				queue.add(n.left);
			}
			if (n.right != null) {
				queue.add(n.right);
			}
		}

		System.out.print(Arrays.toString(list.toArray()));

	}

}
