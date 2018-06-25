package DataStructures;

/**
 * 
 * 
 * @author subhadeepbhattacharyya
 *
 *         The question says that given a particular string you are supposed to
 *         find if you can convert it into a palindrome by deleting one
 *         character.
 * 
 *         We maintain two pointers for the question. One from the starting of
 *         the string and one from the ending of the string. We keep looping
 *         through the characters until we find an unequality. Once we find an
 *         unequality we then skip that position and again start checking for
 *         paliindromes from the next index. this could be i+1,j and i,j-1 if we
 *         find that these string are palindromes this means that that if we
 *         exclude the ith of jth character we can convert the current string
 *         into a palindrome.
 */

public class ValidPalindrome {

	public static boolean isValidPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end && s.charAt(start) == s.charAt(end)) {
			start++;
			end--;
		}
		if (start >= end)
			return true;
		if (isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1))
			return true;

		return false;

	}

	public static boolean isPalindrome(String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String input = "abcda";
		System.out.println(isValidPalindrome(input));
	}

}
