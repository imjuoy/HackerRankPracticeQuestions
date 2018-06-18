/**
 * This is using Bucket Sort algorithm
 * Time Complexity :: O(n)
 * Space Complexity :: O(1)
 */

package DataStructures;

public class SortCharactersByFrequency_BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Tree";
		char[] charArray = input.toCharArray();
		int[] map = new int[256];
		int max = 0;
		for (Character c : charArray) {
			map[c]++;
			max = Math.max(max, map[c]);
		}

		// This block of code is used to create the buckets from the above frequency map
		// array.
		// The buckets need to be max+1 because the index of the array should start from
		// 1 as we are tracking elements
		// which have a frequency of atleast 1.
		String[] buckets = new String[max + 1];
		for (int i = 0; i < 256; i++) {
			String count = buckets[map[i]];
			if (map[i] > 0) {
				buckets[map[i]] = (count == null) ? "" + (char) i : count + (char) i;
				// System.out.println(i + " " + buckets[map[i]]);
			}
		}

		// Below code is to finally build the string from the buckets
		StringBuilder sb = new StringBuilder();
		for (int i = buckets.length - 1; i > 0; i--) {
			char[] data = buckets[i].toCharArray();
			for (Character c : data) {
				for (int j = 0; j < i; j++)
					sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
