/*
 * Company : Amazon
 */

package Algorithms;

public class FindEquilibriumOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 2, 26, 18, 9, 19 };
		int start = 0;
		int end = arr.length - 1;
		int sum1 = arr[start];
		int sum2 = arr[end];
		while (start < end) {
			if (sum1 < sum2) {
				start++;
				sum1 += arr[start];
			} else if (sum1 > sum2) {
				end--;
				sum2 += arr[end];
			}
			if (sum1 == sum2) {
				// if (end - 1 == start + 1)
				System.out.println(start + 1);
				break;
			}
		}
	}

}
