package DataStructures;

public class StringReverseRecursion {

	public static String reverseStr(String input) {
		if (input.isEmpty())
			return input;
		return reverseStr(input.substring(1)) + input.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";
		String result = reverseStr(input);
		System.out.println(result);

	}

}
