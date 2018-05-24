package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class Fisher_Yates_Shuffle_Algorithm {

	public static int[] shuffle(int[] nums) {
		Random r = new Random();// This is the random number generator
		for (int i = nums.length - 1; i > 0; i--) {
			int randomIndex = r.nextInt(i);// Generate a random number between 0 and i
			int temp = nums[i];// swap the number at ith position with the random index generated
			nums[i] = nums[randomIndex];
			nums[randomIndex] = temp;
		}
		return nums;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 4, 5, 7, 8, 3, 5 };
		int shuffledArray[] = shuffle(nums);
		System.out.println(Arrays.toString(shuffledArray));
	}

}
