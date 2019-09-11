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
		root = insert(root, value);
	}
	private Node insert(Node current, int value) {
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
		// IMPLEMENT
		inOrder(root);
	}
	private void inOrder(Node node) {
		if (node == null) {
		      return;
		}
		inOrder(node.left);
		System.out.printf("%s ", node.value);
		inOrder(node.right);
	}
}
