public class Solution {
	public boolean isIsomorphic(String s, String t) {
		int l = s.length();
		Map<Character, Character> m = new HashMap<>();
		for (int i = 0; i < l; i++)
			if (m.containsKey(s.charAt(i))) {
				if (m.get(s.charAt(i)) != t.charAt(i))
					return false;
			} else
				m.put(s.charAt(i), t.charAt(i));
		m.clear();
		for (int i = 0; i < l; i++)
			if (m.containsKey(t.charAt(i))) {
				if (m.get(t.charAt(i)) != s.charAt(i))
					return false;
			} else
				m.put(t.charAt(i), s.charAt(i));
		return true;
	}
}