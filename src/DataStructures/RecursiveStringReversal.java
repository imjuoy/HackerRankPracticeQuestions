package DataStructures;

public class RecursiveStringReversal {

	public static String Reverse(String s) {
		if (s.isEmpty())
			return s;
		return Reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abab";
		String reverse = Reverse(input);
		if (reverse.equals(input))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
