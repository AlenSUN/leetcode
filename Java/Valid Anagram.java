public class Solution {
	public boolean isAnagram(String s, String t) {
		int[] abc1 = new int[26];
		int[] abc2 = new int[26];
		int l1 = s.length();
		int l2 = t.length();
		for (int i = 0; i < 26; i++)
			abc1[i] = abc2[i] = 0;
		for (int i = 0; i < l1; i++)
			abc1[s.charAt(i) - 'a']++;
		for (int i = 0; i < l2; i++)
			abc2[t.charAt(i) - 'a']++;
		return Arrays.equals(abc1, abc2);
	}
}