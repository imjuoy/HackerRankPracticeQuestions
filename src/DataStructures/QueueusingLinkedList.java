package DataStructures;

public class QueueusingLinkedList {

	Node front, rear;

	public QueueusingLinkedList() {
		this.front = null;
		this.rear = null;
	}

	public void enQueue(Object item) {

		Node newNode = new Node(item);

		if (front == null || rear == null)
			front = rear = newNode;
		newNode.next = rear.next;
		rear.next = newNode;
		rear = newNode;
	}

	public Node deQueue() {
		if (front == null || rear == null)
			return front;
		Node returnNode = front;
		front = front.next;
		if (front == null)
			rear = null;

		return returnNode;
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
		QueueusingLinkedList a = new QueueusingLinkedList();
		a.enQueue(4);
		a.enQueue(5);
		a.enQueue(6);

		Node returnedNode1 = a.deQueue();
		Node returnedNode2 = a.deQueue();
		System.out.println(returnedNode2.data);

	}
}
