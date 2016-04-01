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
	public boolean isSymmetric(TreeNode root) {
		Stack<TreeNode> order = new Stack<>();
		Stack<TreeNode> reverse = new Stack<>();
		if (root != null) {
			order.push(root);
			reverse.push(root);
		}
		while (!order.empty() && !reverse.empty()) {
			TreeNode node1 = order.pop();
			TreeNode node2 = reverse.pop();
			if (node1.val != node2.val)
				return false;
			if (node1.right != null && node2.left != null) {
				order.push(node1.right);
				reverse.push(node2.left);
			} else if (!(node1.right == null && node2.left == null))
				return false;
			if (node1.left != null && node2.right != null) {
				order.push(node1.left);
				reverse.push(node2.right);
			} else if (!(node1.left == null && node2.right == null))
				return false;
		}
		return true;
	}
}