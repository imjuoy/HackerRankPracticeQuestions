/**
 * Implement add and search word data structure using ArrayList and HashMap.
 * Although this beats 98% of runtimes in Leetcode this is not the ideal solution since insertion into hashmap might 
 * have a time-complexity of O(n) in worst case due to collision.
 */

package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddandSearchWord {

	private HashMap<Integer, List<String>> dictionary;

	public AddandSearchWord() {
		dictionary = new HashMap<>();
	}

	public void insertWord(String word) {
		int index = word.length();
		if (!dictionary.containsKey(index)) {
			List<String> list = new ArrayList<String>();
			list.add(word);
			dictionary.put(index, list);
		} else {
			dictionary.get(index).add(word);
		}
	}

	public boolean Search(String word) {
		int index = word.length();
		if (!dictionary.containsKey(index))
			return false;
		List<String> list = dictionary.get(index);
		for (String s : list) {
			if (isSame(s, word))
				return true;
		}
		return false;
	}

	public boolean isSame(String s, String word) {
		for (int i = 0; i < s.length(); i++) {
			if (word.charAt(i) != '.' && word.charAt(i) != s.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddandSearchWord obj = new AddandSearchWord();
		String word = "bad";
		String searchWord = "..ad";
		obj.insertWord(word);
		System.out.println(obj.Search(searchWord));
	}

}
