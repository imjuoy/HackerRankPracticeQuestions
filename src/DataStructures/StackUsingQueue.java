package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int top;

	public StackUsingQueue() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}

	public void push(int x) {
		q1.add(x);
		top = x;
	}

	public int pop() {
		while (q1.size() > 1) {
			top = q1.remove();
			q2.add(top);
		}
		int res = q1.poll();
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue a = new StackUsingQueue();
		a.push(4);
		a.push(5);
		a.push(6);
		a.push(7);

		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
	}

}
