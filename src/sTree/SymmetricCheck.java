package sTree;

public class SymmetricCheck {
	 public static void main(String[] args) {
		
		 //Symmetric Tree:
		 //		 overlapping the left side of tree and right side of the tree
		 //		 	OR if we can put mirror on root node
		 
//		 Symmetric Tree
		 Node root = new Node(1);
		 root.left = new Node(2);
		 root.right = new Node(2);
		 root.left.left = new Node(3);
		 root.left.right = new Node(4);
		 root.right.left = new Node(4);
		 root.right.right = new Node(3);
		 
//		 Non-Symmetric Tree
		 Node root1 = new Node(1);
		 root1.left = new Node(2);
		 root1.right = new Node(2);
		 root1.left.right = new Node(3);
		 root1.right.right = new Node(3);
		 
		 System.out.println("1st Tree is symmetric : "+ isSymmetricHelp(root.left, root.right));
		 System.out.println("2nd Tree is symmetric : "+ isSymmetricHelp(root1.left, root1.right));
		 
	}
	 						
	 public static boolean isSymmetricHelp(Node nodeLeft , Node nodeRight) {
		 
		 if(nodeLeft == null || nodeRight == null)		
			 return nodeLeft == nodeRight;		//we cant do return true; as if one of them is null ...it will return true 
		 										//it covers both the cases ...first is null or second is null(gives false) and Both are null (gives true).
		 
		 if(nodeLeft.data!=nodeRight.data)
			 return false;
		 
		 return (isSymmetricHelp(nodeLeft.left, nodeRight.right)		//here the imp part is that..in mirror the left part appears on right
				 && isSymmetricHelp(nodeLeft.right, nodeRight.left));  // that why the nodeLeft.left is compare with nodeRight.right
		 
	 }
	 
	 

}
