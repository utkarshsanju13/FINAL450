// Its contains all the BFS techniques In Order, Pre Order, Post Order 

package sTree;

public class BFSRecursion {

	public void inOrder(Node node) {
		
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(node.data+ " ");
		inOrder(node.right);
		
	}
	
	public void preOrder(Node node) {
		
		if(node == null)
			return;
		
		System.out.print(node.data+ " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder(Node node) {
		
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data +  " ");
		
		
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		
		BFSRecursion bfs = new BFSRecursion();
		bfs.inOrder(root);
		System.out.println();
		bfs.preOrder(root);
		System.out.println();
		bfs.postOrder(root);
	}
	
}
