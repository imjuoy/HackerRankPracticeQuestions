package DataStructures;

public class RecursivePalindrome {

	public static boolean isPalindrome(String input) {
		if (input.length() == 1 || input.length() == 0)
			return true;
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			isPalindrome(input.substring(1, input.length() - 1));
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abab";
		boolean result = isPalindrome(input);
		System.out.println(result);
	}

}
