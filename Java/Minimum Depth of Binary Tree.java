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
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		int l = minDepth(root.left);
		int r = minDepth(root.right);
		if (l == 0)
			return r + 1;
		if (r == 0)
			return l + 1;
		return l < r ? l + 1 : r + 1;
	}
}