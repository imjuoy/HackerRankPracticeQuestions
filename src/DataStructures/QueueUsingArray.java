package DataStructures;

public class QueueUsingArray {

	int size;
	int rear, front;
	int capacity;
	int[] array;

	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		this.front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	public boolean isFull() {
		return capacity == size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enQueue(int item) {
		if (isFull())
			return;
		rear = (rear + 1) % capacity;
		array[rear] = item;
		size++;
	}

	public int deQueue() {
		if (isEmpty())
			return -1;
		int item = array[front];
		front = (front + 1) % capacity;
		size--;
		return item;
	}

	public void printQueue() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public int getRear() {
		if (isEmpty())
			return -1;
		return rear;
	}

	public int getFront() {
		if (isEmpty())
			return -1;
		return front;
	}

	public static void main(String[] args) {
		QueueUsingArray a = new QueueUsingArray(4);
		a.enQueue(4);
		a.enQueue(5);
		a.enQueue(6);
		a.enQueue(7);
		System.out.println(a.getRear());
		int firstItem = a.deQueue();
		System.out.println(firstItem);
		System.out.println(a.getRear());

		int secondItem = a.deQueue();
		System.out.println(secondItem);

		a.printQueue();

	}
}
