package sTree;

public class CheckTreeIsBalancedOrNot {
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
		
		System.out.println(isBalanced(root));
		
		
	}
	
	public static Boolean isBalanced(Node root) {
		
		return dfsHeight(root) != -1;
	}

	private static int dfsHeight(Node root) {
		
		/*for brute force 
		
		bool check(Node)
		{
			if node == null
					return
			Lh = check(node->left)
			Rh = check(node-> right)		//But in this case the complexity is O(N2)
			
			if(abs(lh -rh) > 1) false;
			
			bool left = check(node.left);
			bool right = check(Node.right);
			
			if(!left || !right) return false;
			
			Return Right;
		}*/
		
		/*but while we go for little modification in maxDepth or height code that if we found the height,  the tree a balanced of if 
		the output is not height of the tree then return -1
				
				THAT MAKES IT TO THE COMPLEXITY WITH O(N)*/
		
		if(root == null)
			return 0;
		
		int leftHeight = dfsHeight(root.left);
		if(leftHeight == -1) return -1;
		int rightHeight = dfsHeight(root.right);
		if(rightHeight == -1) return -1;
		
		if(leftHeight - rightHeight > 1)
			return -1;
		
		return 1+Math.max(leftHeight, rightHeight);
		
	}

}
