package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Duplicates_optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdabcdef";
		int len = input.length();
		int ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0, j = 0; j < len; j++) {
			if (map.containsKey(input.charAt(j)))
				i = Math.max(map.get(input.charAt(j)), i);// Very critical step. This is where we increment i to j'+1
															// where j' is the index of the duplicate character.
			ans = Math.max(ans, j - i + 1);
			map.put(input.charAt(j), j + 1);
		}
		System.out.println(ans);
	}

}
