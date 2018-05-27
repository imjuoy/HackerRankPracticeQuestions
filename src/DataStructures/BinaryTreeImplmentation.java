package DataStructures;

public class BinaryTreeImplmentation {

	class Node {

		int key;
		Node left, right;

		public Node(int key) {
			this.key = key;
		}

	}

	Node root;

	public BinaryTreeImplmentation() {
		root = null;
	}

	public BinaryTreeImplmentation(int key) {
		root = new Node(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeImplmentation a = new BinaryTreeImplmentation(1);
		a.root.left = a.new Node(2);
		a.root.right = a.new Node(4);

		a.root.left.left = a.new Node(5);

	}

}
