package sTree;

public class MaxPathSumOfTree {
	public static void main(String[] args) {
		
		Node root = new Node(-10);
		root.left = new Node(9);
		root.right = new Node(20);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		
		System.out.println(maxPathSum(root));
		
	}
	
	public static int maxPathSum(Node root)
	{
		int [] maxValue = new int[1];
		maxValue[0] = Integer.MIN_VALUE;
		findPath(root, maxValue);
		return maxValue[0];
	}
	
	public static int findPath(Node node, int [] maxValue)
	{
		/*same as maxdepth and diameter of the tree in this we have to maintain
		the sum of node.data + max(leftH, rightH)
		Recursively we go at the left node then we maintain which side of the node of the tree
		has a maximum sum and by backtracking the path we maintain the maxvalue VALUE*/
		
		if(node== null)
			return 0;
		
		int leftH = findPath(node.left, maxValue);
		if(leftH < 0)
			leftH = 0;
		int rightH = findPath(node.right, maxValue);
		if(rightH < 0)
			rightH = 0;
		
		maxValue[0] = Math.max(maxValue[0], node.data + leftH + rightH);
		
		return node.data + Math.max(leftH,rightH);
		
	}
}
