package DataStructures;

import java.util.Stack;

public class QueueusingStackRecursion {

	Stack<Integer> s1;

	public QueueusingStackRecursion() {
		s1 = new Stack<Integer>();

	}

	public void enQueue(int item) {
		s1.push(item);
	}

	public int deQueue() {
		if (s1.isEmpty())
			System.out.println("The Queue is empty");
		else if (s1.size() == 1)
			return s1.pop();
		else {
			int x = s1.pop();
			int result = deQueue();
			s1.push(x);
			return result;
		}
		return 0;
	}

	public static void main(String[] args) {

		QueueusingStackRecursion a = new QueueusingStackRecursion();
		a.enQueue(4);
		a.enQueue(5);
		a.enQueue(6);

		System.out.println(a.deQueue());
		System.out.println(a.deQueue());
		System.out.println(a.deQueue());

	}

}
