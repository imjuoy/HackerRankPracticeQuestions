package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue_ApproachIII {

	private Queue<Integer> q1;
	private int top;

	public StackUsingQueue_ApproachIII() {
		this.q1 = new LinkedList<Integer>();
	}

	public void push(int x) {
		q1.add(x);
		top = x;
		int size = q1.size();
		while (size > 1) {
			q1.add(q1.remove());
			size--;
		}

	}

	public int pop() {
		if (!q1.isEmpty())
			top = q1.peek();
		return q1.remove();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingQueue_ApproachIII a = new StackUsingQueue_ApproachIII();
		a.push(6);
		a.push(7);
		a.push(8);

		System.out.println(a.pop());
		System.out.println(a.pop());

	}

}
