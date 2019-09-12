package util;
public class BinTree {
	private Node root;
	
	private class Node {
		int value;
		Node right;
		Node left;
		Node(int value) {
			this.value = value;
		}
	}
	public void insertNode(int value) {
		/* Inserts a node with an integer value into our Binary Tree.
		   Uses helper method to correctly order nodes by value.
		*/
		root = insert(root, value);
	}
	private Node insert(Node current, int value) {
		/* Helper method that correctly orders nodes by value.
		   • If no nodes exist in the BinTree instance, the first added becomes the root.
		   • Nodes added that are less than the current are added to the left.
		   • Nodes added that are greater than the current are added to the right.
		   • Nodes that are equal are taken into account.
		*/ 
		if (current == null) {
			current = new Node(value);
		}
		if (value < current.value) {
			current.left = insert(current.left, value);
		} else if (value > current.value) {
			current.right = insert(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;
	}
	public void treeWalk() {
		// Method that uses the inOrder helper method to correctly traverse the tree in order.
		inOrder(root);
	}
	private void inOrder(Node node) {
		// Helper method that traverses our Binary Tree instances in correct order.
		if (node == null) {
		      return;
		}
		inOrder(node.left);
		System.out.printf("%s ", node.value);
		inOrder(node.right);
	}
}