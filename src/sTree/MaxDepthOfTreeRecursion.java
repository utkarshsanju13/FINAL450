package sTree;

public class MaxDepthOfTreeRecursion {

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
		
		System.out.println(maxDepth(root));
		
	}
	
	public static  int maxDepth(Node node) {
		
		if(node == null)
			return 0;
		
		int leftH = maxDepth(node.left);
		int rightH = maxDepth(node.right);
		
		return 1 + Math.max(leftH, rightH);
	}
}
