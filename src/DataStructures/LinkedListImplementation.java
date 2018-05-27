package DataStructures;

/**
 * Implementation of a singly linked List
 * 
 */

public class LinkedListImplementation {

	protected Node head;
	public int size;

	public LinkedListImplementation() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;

	}

	// Add an element to the end of the linkedList
	public void add(Object val) {
		if (head == null) { // checks if the linkedlist is current null

			head = new Node(val);
		}
		// Otherwise if the current list is not null
		Node newNode = new Node(val);
		Node curr = head;
		if (curr != null) {
			while (curr.next != null)
				curr = curr.next;
			curr.next = newNode;

		}
		size++;
	}

	public void add(Object val, int Index) {
		Node newNode = new Node(val);
		Node curr = head;
		if (curr != null) {
			for (int i = 0; i < Index && curr.getNext() != null; i++)
				curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		size++;
	}

	public Object get(int index) {
		if (index < 0)
			return null;
		Node curr = null;
		if (head != null) {
			curr = head.next;
			for (int i = 0; i < index; i++) {
				if (curr.next == null)
					return null;
				curr = curr.next;
			}
			return curr.data;
		}
		return head;
	}

	public boolean remove(int index) {
		if (index < 0 || index > size)
			return false;
		Node curr = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (curr.next == null)
					return false;
				curr = curr.next;
			}
			curr.next = curr.next.next;
			size--;
			return true;
		}
		return false;
	}

	class Node {

		protected Object data;
		protected Node next;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object Data) {
			data = Data;
		}

		public Object getNext() {
			return next;
		}

		public void setNext(Node nextNode) {
			next = nextNode;
		}

	}

	public static void main(String[] args) {
		LinkedListImplementation newList = new LinkedListImplementation();
		newList.add(3);
		newList.add(4);
		System.out.println(newList.size);
		System.out.println(newList.get(0) + " " + newList.get(1));
		System.out.println(newList.remove(0));
		System.out.println(newList.size);
		System.out.println(newList.get(0));
		newList.add(5, 0);
		System.out.println(newList.get(0) + " " + newList.get(1));
	}

}
