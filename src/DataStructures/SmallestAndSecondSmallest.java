package DataStructures;

public class SmallestAndSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 3, 6, 9, 8 };
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				secondMin = min;
				min = input[i];
			} else if (input[i] < secondMin && input[i] != min)
				secondMin = input[i];
		}
		System.out.println(min + " " + secondMin);
	}

}
