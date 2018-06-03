/**
 * This program is meant to print the Kth Largest element in three ways.
 * 
 * 1. Using priority Queue
 * 2. Using Arrays.sort
 * 3. Using quick sort mechanism
 * 
 */

package Algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement_in_two_ways {

	public static int KthLargestElementUsingPriorityQueues(int[] nums, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				return n1 - n2;
			}
		});

		for (int numbers : nums) {
			queue.offer(numbers);

			if (queue.size() > k)
				queue.poll();
		}

		return queue.peek();

	}

	public static int KthLargestElementUsingArrays(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 4, 5, 5, 7, 8, 5 };
		int k = 2;

		int result1 = KthLargestElementUsingPriorityQueues(nums, k);
		int result2 = KthLargestElementUsingArrays(nums, k);

		System.out.println(result1 + " " + result2);
	}

}
