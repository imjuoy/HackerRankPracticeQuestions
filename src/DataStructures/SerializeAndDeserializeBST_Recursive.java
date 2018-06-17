package DataStructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBST_Recursive {
	private static final String separator = ",";
	private static final String NULL = "null";

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		return serializer(root, sb);
	}

	public String serializer(TreeNode root, StringBuilder sb) {
		if (root == null)
			sb.append(NULL).append(separator);
		else {
			sb.append(root.val).append(separator);
			serializer(root.left, sb);// because we are doing a pre order
			serializer(root.right, sb);
		}
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		System.out.println(data);
		if (data.equals(NULL) || data.length() == 0)
			return null;
		// String[] dataToChar = data.split(separator);
		Queue<String> queue = new LinkedList<>();
		queue.addAll(Arrays.asList(data.split(separator)));
		return deseralize(queue);

	}

	public TreeNode deseralize(Queue<String> queue) {
		if (queue.isEmpty())
			return null;
		String curr = queue.poll();
		if (curr.equals(NULL))
			return null;
		TreeNode root = new TreeNode(Integer.parseInt(curr));
		root.left = deseralize(queue);
		root.right = deseralize(queue);
		return root;
	}
}
