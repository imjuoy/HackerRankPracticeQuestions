package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueApproachII {

	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int top;

	public StackUsingQueueApproachII() {
		this.q1 = new LinkedList<Integer>();
		this.q2 = new LinkedList<Integer>();
	}

	public void push(int x) {
		q2.add(x);
		top = x;
		while (!q1.isEmpty())
			q2.add(q1.remove());
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	public int pop() {
		if (!q1.isEmpty())
			top = q1.peek();
		return q1.remove();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingQueueApproachII a = new StackUsingQueueApproachII();
		a.push(4);
		a.push(5);
		a.push(6);
		a.push(7);

		System.out.println(a.pop());
		System.out.println(a.pop());

	}

}
