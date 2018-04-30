package DataStructures;

public class InsertIntoABST {
	
		private TreeNode root;
		private int counter = 0;

		public void CreateBinarySearchTree(int[] keys) {
	        for (int item : keys) {
	            add(item);
	            System.out.println(counter);
	        }
	    }

	    private static class TreeNode {
	        TreeNode left;
	        int item;
	        TreeNode right;

	        TreeNode(TreeNode left, int item, TreeNode right) {
	            this.left = left;
	            this.right = right;
	            this.item = item; 
	        }
	    }

	    public void add(int item) {
	        if (root == null) {
	            root = new TreeNode(null, item, null);
	             }else {
	            addNext(root, item);
	            counter++;
	          }
	        }
	        
	public void addNext(TreeNode node, int item) 
	        {
	        if (item < node.item) {
	        if (node.left == null) {
	            node.left = new TreeNode(null, item, null);
	        } else {
	            addNext(node.left, item);
	        }
	    } 
	    else if (item > node.item) {
	        if (node.right == null) {
	            node.right = new TreeNode(null, item, null);
	        } else {
	            addNext(node.right, item);
	        }
	    }
	}


}
