package DataStructures;

import java.util.Stack;

public class StringReverseUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Abcd";
		Stack<Character> stack = new Stack<>();
		for (char s : input.toCharArray()) {
			stack.push(s);
		}
		while (!stack.isEmpty())
			System.out.print(stack.pop());
	}

}
