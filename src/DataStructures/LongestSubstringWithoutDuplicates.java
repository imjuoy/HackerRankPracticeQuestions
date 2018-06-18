package DataStructures;

import java.util.HashSet;
import java.util.Set;

/*
 * Time Complexity : O(2n) or O(n)
 * Space Complexity: 
 */

public class LongestSubstringWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdabcdee";
		int len = input.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < len && j < len) {
			if (!set.contains(input.charAt(j))) {
				set.add(input.charAt(j));
				j++;
				ans = Math.max(ans, j - i);
			} else {
				set.remove(input.charAt(i));
				i++;
			}
		}
		System.out.println(ans);
	}

}
