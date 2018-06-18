package DataStructures;

public class ReverseWordsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "I am joy.This is my program";
		// There are three steps to do this.
		// 1. Convert the string to a character array
		// 2. Reverse the character array.
		// 3. Now reverse every word in the character array.
		// 4. Remove trailing,following spaces.

		// Step 1
		char[] str = word.toCharArray();
		int len = str.length;

		// Step 2
		reverse(str, 0, len - 1);

		// Step3
		reverseEachWord(str, len);

		// Step 4
		String reversedString = removeSpaces(str, len);

		System.out.println(reversedString);
	}

	public static void reverse(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	public static void reverseEachWord(char[] str, int len) {
		int i = 0, j = 0;
		while (i < len) {
			while (i < j || i < len && str[i] == ' ')
				i++;
			while (j < i || j < len && str[j] != ' ')
				j++;
			reverse(str, i, j - 1);
		}
	}

	public static String removeSpaces(char[] str, int len) {
		int i = 0, j = 0;
		while (j < len) {
			while (j < len && str[j] == ' ')
				j++;
			while (j < len && str[j] != ' ')
				str[i++] = str[j++];
			while (j < len && str[j] == ' ')
				j++;
			if (j < len)
				str[i++] = ' ';
		}
		return new String(str).substring(0, i);
	}

}
