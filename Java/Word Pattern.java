public class Solution {
	public boolean wordPattern(String pattern, String str) {
		String[] split = str.split(" ");
		if (pattern.length() != split.length)
			return false;

		Map<Character, String> m = new HashMap<>();
		int l = pattern.length();
		for (int i = 0; i < l; i++) {
			if (m.containsKey(pattern.charAt(i))) {
				if (!m.get(pattern.charAt(i)).equals(split[i]))
					return false;
			} else if (m.containsValue(split[i]))
				return false;
			m.put(pattern.charAt(i), split[i]);
		}
		return true;
	}
}