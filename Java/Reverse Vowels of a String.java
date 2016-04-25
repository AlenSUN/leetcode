public class Solution {
	public String reverseVowels(String s) {
		char[] ca = s.toCharArray();
		int l = s.length();
		int p1 = 0, p2 = l - 1;
		for (; p1 < p2; p1++)
			if (isVowel(ca[p1]))
				for (; p2 > p1; p2--)
					if (isVowel(ca[p2])) {
						char t = ca[p1];
						ca[p1] = ca[p2];
						ca[p2] = t;
						p2--;
						break;
					}
		return String.copyValueOf(ca);
	}

	public boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
			|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
}