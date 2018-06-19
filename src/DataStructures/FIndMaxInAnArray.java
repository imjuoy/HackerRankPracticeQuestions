package DataStructures;

public class FIndMaxInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 7, 8, 9, 10 };
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				secondMax = max;
				max = input[i];
			} else if (input[i] > secondMax && input[i] != max)
				secondMax = input[i];
		}
		System.out.println(max);
		System.out.println(secondMax);

	}

}
