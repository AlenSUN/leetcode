public class Solution {
	public String longestCommonPrefix(String[] strs) {
		int longest = Integer.MAX_VALUE;
		int l = strs.length;
		if (l == 0)
			return "";
		if (l == 1)
			return strs[0];

		for (int i = 1; i < l; i++) {
			int l1 = strs[i - 1].length();
			int l2 = strs[i].length();
			for (int j = 0; j <= l1 && j <= l2; j++)
				if (j == l1 || j == l2 || strs[i - 1].charAt(j) != strs[i].charAt(j))
					if (j < longest)
						longest = j;
		}
		return strs[0].substring(0, longest);
	}
}