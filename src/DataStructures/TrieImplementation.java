package DataStructures;

public class TrieImplementation {

	private TrieNode root;

	public TrieImplementation() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char current = word.charAt(i);
			if (node.links[current - 'a'] == null)
				node.links[current - 'a'] = new TrieNode();
			node = node.links[current - 'a'];
		}

		node.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char current = word.charAt(i);
			if (node.links[current - 'a'] == null)
				return false;
			node = node.links[current - 'a'];
		}
		return node.isEnd;
	}

	public boolean SearchPrefix(String prefix) {
		TrieNode node = root;
		for (int i = 0; i < prefix.length(); i++) {
			char current = prefix.charAt(i);
			if (node.links[current - 'a'] == null)
				return false;
			node = node.links[current - 'a'];
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieImplementation a = new TrieImplementation();
		String word = "leetcode";
		String prefix = "leet";
		a.insert(word);
		System.out.println(a.search(word));
		System.out.println(a.SearchPrefix(prefix));

	}

}

// This is used to denote the indivdual TrieNodes

class TrieNode {

	public TrieNode links[];
	private final int R = 26;
	public boolean isEnd;

	public TrieNode() {
		links = new TrieNode[R];
		isEnd = false;
	}
}
