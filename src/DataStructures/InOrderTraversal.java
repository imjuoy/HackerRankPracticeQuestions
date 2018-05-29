package DataStructures;

public class InOrderTraversal {

	class Node {
		Node left, right;
		Object key;

		public Node(Object key) {
			this.key = key;
			left = right = null;
		}

	}

	Node root;

	public InOrderTraversal() {
		// TODO Auto-generated method stub
		root = null;
	}

	void printInOrderTraversal(Node root) {
		if (root == null)
			return;

		printInOrderTraversal(root.left);
		System.out.println("The value is:" + root.key);
		printInOrderTraversal(root.right);
	}

	public static void main(String[] args) {

		InOrderTraversal a = new InOrderTraversal();
		a.root = a.new Node(1);
		a.root.left = a.new Node(3);
		a.root.right = a.new Node(4);
		a.root.right.left = a.new Node(7);
		a.root.right.right = a.new Node(8);
		a.root.left.left = a.new Node(5);
		a.root.left.right = a.new Node(6);

		System.out.println("The preorder traversal is");
		a.printInOrderTraversal(a.root);

	}

}
