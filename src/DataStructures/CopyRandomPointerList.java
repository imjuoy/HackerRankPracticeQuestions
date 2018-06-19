package DataStructures;

/**
 * Time Complexity: O(n) Space Complexity: O(1) since we are using a linkedlist
 * for addition.
 * 
 * @author subhadeepbhattacharyya
 *
 */

class RandomPointerNode {
	int label;
	RandomPointerNode next;
	RandomPointerNode random;

	public RandomPointerNode(int value) {
		this.label = value;
	}
}

public class CopyRandomPointerList {

	public static RandomPointerNode CopyList(RandomPointerNode head) {
		RandomPointerNode iter = head, next;
		while (iter != null) {
			next = iter.next;
			RandomPointerNode copy = new RandomPointerNode(iter.label);
			iter.next = copy;
			copy.next = next;
			iter = next;
		}

		iter = head;
		while (iter != null) {
			if (iter.random != null) {
				iter.next.random = iter.random.next;
			}
			iter = iter.next.next;// Crucial step since in the previous step we have already made the next of the
									// original list point to the new copy node.
		}

		// This step is crucial and confusing. We need to separate the original list and
		// the copy list

		RandomPointerNode pseudoHead = new RandomPointerNode(0);
		iter = head;
		RandomPointerNode copy, copyIter = pseudoHead;
		while (iter != null) {
			next = iter.next.next;// We are storing the original next values;
			copy = iter.next;// pointing to the copy node.
			copyIter.next = copy;// This variable is just an iterator for the building up the copy list
			copyIter = copy;// This will be updated to the current node in every iteration

			iter.next = next;// reversing the value of next which was pointing to the copied nodes originally
								// to the actual next node in the list
			iter = next;// finally updating the pointer to point to the next node
		}
		return pseudoHead;// return the new node
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To-do : Code to run the program
	}

}
