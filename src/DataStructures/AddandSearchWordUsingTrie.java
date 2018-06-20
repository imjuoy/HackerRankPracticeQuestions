/**
 * Add and Search elements using Trie
 * 
 */

package DataStructures;

public class AddandSearchWordUsingTrie {

	class TrieNode {
		public TrieNode[] links;
		public boolean isEnd;

		public TrieNode() {
			links = new TrieNode[26]; // considering that all characters will be lower case
			isEnd = false;
		}
	}

	private TrieNode root;

	public AddandSearchWordUsingTrie() {
		root = new TrieNode();
	}

	public void addWord(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char current = word.charAt(i);
			if (node.links[current - 'a'] == null)
				node.links[current - 'a'] = new TrieNode();
			node = node.links[current - 'a'];
		}
		node.isEnd = true;
	}

	public boolean Search(String word) {
		return isPresent(word.toCharArray(), 0, root);
	}

	// Logic behind the isPresent function.
	/*
	 * Lets say the word is bad and we are searching bad
	 * 
	 * The second if condition gets invoked and the recursion tree starts
	 * 
	 * b--a--d As soon as we have access d node the recursion call has index as 3
	 * and the first if condition is satisfied so d recursion call returns true, Now
	 * we go the a recursion call which is now true && true(since the second
	 * condition has now returned true) so it is also true, and finally the same
	 * repeats for b which gets true for the a recursion call and the final result
	 * true is returned.
	 * 
	 * Now if we are searching for ..d We go to the else condition Since we do not
	 * know the first two letters here, we cannot directly write word[index] - 'a'
	 * as this will not return a valid value So we will have to loop through all the
	 * 26 nodes and find out which one is not null. This is the reason for using a
	 * for loop which says root.links.length if any position is not null that means
	 * it has a trienode there and hence we can start our recursive search from this
	 * place. Therefore the below recursive call, isPresent(word,index+1,
	 * root.links[i]) This way we can keep, looping around the word until .. are
	 * over and finally when we find a character we can invoke the second if and
	 * continue with the recursion.
	 */

	public boolean isPresent(char[] word, int index, TrieNode root) {
		if (index >= word.length)
			return root.isEnd;
		if (word[index] != '.')
			return root.links[word[index] - 'a'] != null && isPresent(word, index + 1, root.links[word[index] - 'a']);
		else {
			for (int i = 0; i < root.links.length; i++) {
				if (root.links[i] != null) {
					if (isPresent(word, index + 1, root.links[i]))
						return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddandSearchWordUsingTrie obj = new AddandSearchWordUsingTrie();
		obj.addWord("bad");
		System.out.println(obj.Search("..a"));
	}

}
