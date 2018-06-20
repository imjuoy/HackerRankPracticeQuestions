package DataStructures;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -3, 1, 2, -2, 5, 6 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int len = arr.length;
		int max1 = arr[len - 1] * arr[len - 2] * arr[len - 3];
		int max2 = arr[0] * arr[1] * arr[len - 1];
		int max = max1 > max2 ? max1 : max2;
		System.out.println(max);
	}

}
