package DataStructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SerializeAndDeserializeBST_Iterative {
	private static final String separator = ",";
	private static final String NULL = "null";

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if (root == null)
			return NULL;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode data = stack.pop();
			sb.append(data.val).append(separator);
			if (data.right != null)
				stack.push(data.right);
			if (data.left != null)
				stack.push(data.left);
		}
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		System.out.println(data);
		if (data.equals(NULL) || data.length() == 0)
			return null;
		// String[] dataToChar = data.split(separator);
		Queue<Integer> queue = new LinkedList<>();
		List<String> dataToList = Arrays.asList(data.split(separator));
		for (String s : dataToList)
			queue.offer(Integer.parseInt(s));
		return deseralize(queue);

	}

	public TreeNode deseralize(Queue<Integer> queue) {
		if (queue.isEmpty())
			return null;
		TreeNode root = new TreeNode(queue.poll());
		Queue<Integer> smallerQueue = new LinkedList<>();
		while (!queue.isEmpty() && queue.peek() < root.val)
			smallerQueue.offer(queue.poll());
		root.left = deseralize(smallerQueue);
		root.right = deseralize(queue);
		return root;
	}
}
