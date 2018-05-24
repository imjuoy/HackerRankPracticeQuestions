package DataStructures;

public class MaximumSubarray {

	public static int getMaxSubArray(int nums[]) {
		int dp[] = new int[nums.length];
		dp[0] = nums[0];
		int result = 0;
		for (int i = 1; i < nums.length; i++) {
			dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			result = Math.max(result, dp[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, -3, -4, -5, 6 };
		int maxSubArray = getMaxSubArray(nums);
		System.out.println(maxSubArray);
	}

}
