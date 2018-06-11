/**
 * This solution is awesome. How can someone think this.
 */

package DataStructures;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = new int[nums.length];
		for (int i = 0, temp = 1; i < nums.length; i++) {
			System.out.println(temp);
			result[i] = temp;
			temp = temp * nums[i];
		}
		for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
			result[i] = result[i] * temp;
			// System.out.print(result[i]);
			temp = temp * nums[i];
		}

		for (int i = 0; i < nums.length; i++)
			System.out.print(result[i]);
	}

}
