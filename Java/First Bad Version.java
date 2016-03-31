/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		long l = 1, r = n;
		int m = 0;
		while (r - l >= 0) {
			m = (int) ((l + r) / 2);
			if (isBadVersion(m)) {
				if (!isBadVersion(m - 1))
					break;
				r = m - 1;
			} else
				l = m + 1;
		}
		return m;
	}
}