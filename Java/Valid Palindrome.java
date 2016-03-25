public class Solution {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int l = s.length();
		int j = l - 1;
		for (int i = 0; i < l; i++)
			if (Character.isLetterOrDigit(s.charAt(i))) {
				while (!Character.isLetterOrDigit(s.charAt(j)))
					j--;
				if (s.charAt(i) != s.charAt(j))
					return false;
				j--;
			}
		return true;
	}
}