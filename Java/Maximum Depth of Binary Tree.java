/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int maxDepth(TreeNode root) {
		// recursive
		if (root == null)
			return 0;
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		return l > r ? l + 1 : r + 1;

		// BFS iterative
		if (root == null)
			return 0;
		Queue<TreeNode> q0 = new LinkedList<>();
		Queue<TreeNode> q1 = new LinkedList<>();
		q1.add(root);
		int d = 0;
		while (!q1.isEmpty()) {
			d++;
			while (!q1.isEmpty())
				q0.add(q1.remove());
			while (!q0.isEmpty()) {
				TreeNode node = q0.remove();
				if (node.left != null)
					q1.add(node.left);
				if (node.right != null)
					q1.add(node.right);
			}
		}
		return d;
	}
}