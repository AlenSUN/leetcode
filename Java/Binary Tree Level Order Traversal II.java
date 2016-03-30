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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> lo = levelOrder(root);
		List<List<Integer>> lob = new ArrayList<>();
		int l = lo.size();
		for (int i = l - 1; i >= 0; i--)
			lob.add(lo.get(i));
		return lob;
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		List<List<Integer>> lol = new ArrayList<>();
		if (root != null)
			q.add(root);
		while (!q.isEmpty()) {
			int l = q.size();
			List<Integer> loi = new ArrayList<>();
			for (int i = 0; i < l; i++) {
				TreeNode t = q.remove();
				loi.add(t.val);
				if (t.left != null)
					q.add(t.left);
				if (t.right != null)
					q.add(t.right);
			}
			lol.add(loi);
		}
		return lol;
	}
}