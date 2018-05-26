package DataStructures;

public class DoublyLinkedList {

	protected Node head;
	protected int size;

	public DoublyLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	// This function will add an object to the starting of the LinkedList
	public void AddFirst(Object val) {
		if (head == null) {
			Node newNode = new Node(val);
			head = newNode;
			newNode.next = null;
			newNode.prev = head;
		}
		Node newNode = new Node(val);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		size++;
	}

	public void AddLast(Object val) {
		if (head == null)
			AddFirst(val);
		Node newNode = new Node(val);
		Node curr = head;
		if (curr != null) {
			while (curr.next != null)
				curr = curr.next;
			newNode.next = curr.next;
			curr.next = newNode;
			newNode.prev = curr;
			size++;
		}
	}

	public void Add(Object val, int index) {
		if (index < 0 || index > size)
			return;
		Node curr = head;
		if (curr != null) {
			for (int i = 0; i < index && curr.next != null; i++)
				curr = curr.next;
		}
		Node newNode = new Node(val);
		newNode.next = curr.next;
		newNode.prev = curr.prev;
		curr.next = newNode;
		size++;
	}

	public Object get(int index) {
		if (index < 0 || index > size)
			return null;
		Node curr = head;
		if (curr != null) {
			for (int i = 0; i < index; i++)
				curr = curr.next;
			return curr.data;
		}
		return head;
	}

	public boolean remove(int index) {
		if (index < 0 || index > size)
			return false;
		Node curr = head;
		if (curr != null) {
			for (int i = 0; i < index; i++)
				curr = curr.next;
			curr.next = curr.next.next;
			head = curr;
			size--;
			return true;
		}
		return false;
	}

	public void printList() {
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.data + " ");
		}

	}

	class Node {

		Object data;
		Node next;
		Node prev;

		public Node(Object data) {
			this.data = data;
			next = null;
			prev = null;
		}

	}

	public static void main(String[] args) {
		try {
			DoublyLinkedList newList = new DoublyLinkedList();
			newList.AddFirst(3);
			newList.AddLast(4);
			System.out.println(newList.size);
			newList.printList();
			newList.remove(0);
			newList.printList();
			newList.Add(5, 0);
			newList.printList();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception thrown");
		}
	}

}
