package util;
public class Main {
	public static void main(String[] args) {
		System.out.println("Homework 1 Pt. 1");
		// testcase 1
		System.out.println("testcase 1:");
		BinTree binTree2 = new BinTree();
		binTree2.insertNode(3);
		binTree2.insertNode(201);
		binTree2.insertNode(60);
		binTree2.insertNode(30);
		binTree2.insertNode(45);
		binTree2.treeWalk();
		// testcase 2
		System.out.println();
		System.out.println("testcase 2_1:");
		BinTree binTree3 = new BinTree();
		binTree3.insertNode(-10);
		binTree3.insertNode(-150);
		binTree3.insertNode(4);
		binTree3.insertNode(300);
		binTree3.insertNode(45);
		binTree3.treeWalk();
		binTree3.insertNode(-50);
		binTree3.insertNode(200);
		System.out.println();
		System.out.println("testcase 2_2:");
		binTree3.treeWalk();
		System.out.println("\nImplemented by James Sipowicz -- 9/10/2019");
	}
}