package DataStructures;

public class PreOrderTravel {

	class Node {
		Node left, right;
		Object key;

		public Node(Object key) {
			this.key = key;
			left = right = null;
		}

	}

	Node root;

	public PreOrderTravel() {
		// TODO Auto-generated method stub
		root = null;
	}

	void printPreOrderTraversal(Node root) {
		if (root == null)
			return;

		System.out.println("The value is:" + root.key);
		printPreOrderTraversal(root.left);
		printPreOrderTraversal(root.right);
	}

	public static void main(String[] args) {

		PreOrderTravel a = new PreOrderTravel();
		a.root = a.new Node(1);
		a.root.left = a.new Node(3);
		a.root.right = a.new Node(4);
		a.root.right.left = a.new Node(7);
		a.root.right.right = a.new Node(8);
		a.root.left.left = a.new Node(5);
		a.root.left.right = a.new Node(6);

		System.out.println("The preorder traversal is");
		a.printPreOrderTraversal(a.root);

	}

}
