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
	public TreeNode invertTree(TreeNode root) {
		// Approach #1 (Recursive)
		if (root == null)
			return null;
		TreeNode left = invertTree(root.right);
		TreeNode right = invertTree(root.left);
		root.left = left;
		root.right = right;
		return root;

		// Approach #2 (Iterative)
		if (root == null)
			return null;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode node = q.remove();
			TreeNode tmp = node.left;
			node.left = node.right;
			node.right = tmp;
			if (node.left != null)
				q.add(node.left);
			if (node.right != null)
				q.add(node.right);
		}
		return root;
	}
}