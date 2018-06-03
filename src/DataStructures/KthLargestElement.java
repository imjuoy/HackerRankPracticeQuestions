package DataStructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 4, 5, 5, 5, 6, 7 };
		int k = 4;

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(array.length, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				return n1 - n2;
			}
		});

		for (int nums : array) {
			queue.offer(nums);

			if (queue.size() > k)
				queue.poll();
		}

		System.out.println(queue.peek());

	}

}
