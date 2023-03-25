package sTree;

public class DiameterOfTreeOptimize {

	
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
		
		System.out.println(findMaxDiameter(root));
	}
	
	public static int findMaxDiameter(Node node) {
		
		int [] diameter = new int[1];
		 DiameterOptimize(node,diameter);
		 return diameter[0];
		
	}
	
	public static int DiameterOptimize(Node node,int[] diameter)
	{
		if(node == null)
			return 0;
		
		int leftH = DiameterOptimize(node.left, diameter);
		int rightH = DiameterOptimize(node.right, diameter);
		
		diameter[0] = Math.max(diameter[0], leftH+ rightH);
		
		return 1+ Math.max(leftH, rightH);
		
		
	}
}
