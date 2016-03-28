public class Solution {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int l1 = v1.length;
		int l2 = v2.length;
		for (int i = 0; i < l1 && i < l2; i++) {
			int n1 = Integer.valueOf(v1[i]);
			int n2 = Integer.valueOf(v2[i]);
			if (n1 != n2)
				return Integer.compare(n1, n2);
		}

		if (l1 > l2)
			for (int i = l2; i < l1; i++)
				if (Integer.valueOf(v1[i]) != 0)
					return 1;
		if (l2 > l1)
			for (int i = l1; i < l2; i++)
				if (Integer.valueOf(v2[i]) != 0)
					return -1;
		return 0;
	}
}