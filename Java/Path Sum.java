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
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		Map<TreeNode, Integer> m = new HashMap<>();
		Queue<TreeNode> q = new LinkedList<>();
		m.put(root, root.val);
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode node = q.remove();
			if (node.left == null && node.right == null)
				if (m.get(node) == sum)
					return true;
			if (node.left != null) {
				m.put(node.left, m.get(node) + node.left.val);
				q.add(node.left);
			}
			if (node.right != null) {
				m.put(node.right, m.get(node) + node.right.val);
				q.add(node.right);
			}
		}
		return false;
	}
}