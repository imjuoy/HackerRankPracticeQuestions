package DataStructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

	class Node {
		private Node next;
		private int val;

		public Node(int val) {
			this.val = val;
		}

	}

	public Node mergeKSortedList(Node[] lists) {
		if (lists == null || lists.length == 0)
			return null;

		PriorityQueue<Node> queue = new PriorityQueue<Node>(lists.length, new Comparator<Node>() {
			public int compare(Node o1, Node o2) {
				return o1.val - o2.val;
			}
		});

		Node result = new Node(0);
		Node head = result;

		for (Node node : lists) {
			if (node != null)
				queue.add(node);
		}

		while (!queue.isEmpty()) {
			head.next = queue.poll();
			head = head.next;

			if (head.next != null)
				queue.add(head.next);
		}

		// System.out.println(result.next.val);
		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeKSortedLists a = new MergeKSortedLists();

		Node head1 = a.new Node(1);
		Node head2 = a.new Node(2);
		Node head3 = a.new Node(3);
		// Node node4 = new Node(4);

		head1.next = a.new Node(4);
		head1.next.next = a.new Node(9);

		head2.next = a.new Node(3);
		head2.next.next = a.new Node(5);

		head3.next = a.new Node(4);
		head3.next.next = a.new Node(6);

		Node[] inputList = new Node[3];

		inputList[0] = head1;
		inputList[1] = head2;
		inputList[2] = head3;

		Node result = a.mergeKSortedList(inputList);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

}
