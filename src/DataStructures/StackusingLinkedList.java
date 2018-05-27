package DataStructures;

public class StackusingLinkedList {

	Node top;
	int size;

	public StackusingLinkedList() {
		this.size = 0;
		this.top = null;

	}

	public boolean push(Object item) {
		if (top == null) {
			Node newNode = new Node(item);
			top = newNode;
		} else {
			Node newNode = new Node(item);
			newNode.next = top;
			top.next = newNode;
			top = newNode;
		}
		return true;
	}

	public Object pop() {
		if (top == null)
			return top;
		Object data = top.data;
		top = top.next;
		return data;
	}

	public Object peek() {
		if (top == null)
			return top;
		return top.data;
	}

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		StackusingLinkedList a = new StackusingLinkedList();
		a.push(4);
		a.push(5);
		a.push(6);

		System.out.println(a.pop());
		System.out.println(a.pop());

	}

}
