package DataStructures;

public class ReverseWordsInaString_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is the second version";

		// For this method we will use a string builder and the split method.
		// Step 1: Split the string into a string array using the split method
		String[] inputArray = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = inputArray.length - 1; i >= 0; i--) {
			sb.append(inputArray[i]).append(" ");
		}
		System.out.println(sb.toString());
	}

}
