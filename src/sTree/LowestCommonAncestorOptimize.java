package sTree;

public class LowestCommonAncestorOptimize {
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
		
		//							6					10
		Node LCA = getLCA(root,root.right.left,root.right.right.right);
		System.out.println(LCA.data);
		
	}

	public static Node getLCA(Node root, Node node, Node node1) {
		
		//base case
		if(root == null || root == node || root == node1)
			return root;
		
		Node left = getLCA(root.left, node, node1);
		Node right = getLCA(root.right, node, node1);
		
		//result
		if(left == null)
			return right;
		else if(right == null)
			return left;
		else
			return root; //if both side is not null then that is the LCA of both, RETURN IT.
			
		
	}
}
