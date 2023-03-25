package sTree;

public class DiameterOfTreeBrute {

	public static int max = 0;
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		root.right.right.right = new Node(7);
		root.right.right.right.right = new Node(8);
		root.right.left.left = new Node(5);
		root.right.left.left.left = new Node(9);
		
		findMax(root);
		System.out.println(max);
		
	} 
	
	public static void findMax(Node node)
	{
//		BRUTE FORCE APPROACH
		/*this solution has a complexity of O(N2)
		as n for finding the height by height() method
		and n for the recursive call of findMax*/
		if(node == null)
			return ;
		
		int leftH = height(node.left);
		int rightH = height(node.right);
		
		max = Math.max(leftH + rightH, max);
		
		findMax(node.left);
		findMax(node.right);
		
		
	}
	
	public static int height(Node node) {
		if(node == null)	
			return 0;
		
		int leftH = height(node.left);
		int rightH = height(node.right);
		
		return 1+(Math.max(leftH, rightH));
		
	}
}
