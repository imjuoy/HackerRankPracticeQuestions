/**
 * Sort Characters by Frequency without using Bucket Sort
 * 1. Use a HashMap to Keep a count of the characters and their frequency
 * 2. Next use an array of lists where each index is the frequency of the elements and store the elements in the list at that index
 * 3. Next traverse the array in reverse order and then print the elements in the list (index times).
 */
/*
 * The below code will print the elements in the decreasing order of their frequencies
 */

package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Tree";
		char[] charArray = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		for (Character c : charArray) {
			if (!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c) + 1);
			max = Math.max(max, map.get(c));
		}

		@SuppressWarnings("unchecked")
		List<Character>[] array = new List[max + 1];
		for (Character c : map.keySet()) {
			int count = map.get(c);
			if (array[count] == null)
				array[count] = new ArrayList<>();
			array[count].add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = array.length - 1; i > 0; i--) {
			List<Character> list = array[i];
			for (Character c : list) {
				for (int j = 0; j < i; j++)
					sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
