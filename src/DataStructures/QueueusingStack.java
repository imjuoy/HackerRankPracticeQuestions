package DataStructures;

import java.util.Stack;

public class QueueusingStack {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public QueueusingStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

	public void enQueue(int value) {
		s1.push(value);
	}

	public int deQueue() {
		if (s1.isEmpty() && s2.isEmpty())
			System.out.println("Queue is empty");

		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				int x = s1.pop();
				s2.push(x);
			}
		}
		int returnVal = s2.pop();
		return returnVal;
	}

	public static void main(String[] args) {

		QueueusingStack a = new QueueusingStack();
		a.enQueue(4);
		a.enQueue(5);
		a.enQueue(6);

		System.out.println(a.deQueue());
		System.out.println(a.deQueue());

	}

}
