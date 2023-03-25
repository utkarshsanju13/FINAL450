package sTree;

import java.util.ArrayList;

public class RootToNodePath {
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

		ArrayList<Integer> result = new ArrayList<>();
		
		rootToNodePath(root, 9, result);
		System.out.println(result);
		
	}
	
	public static boolean rootToNodePath(Node node, int val, ArrayList<Integer> res) {
		
		if(node == null)
			return false;
		
		res.add(node.data);
		
		if(node.data == val)
			return true;
		
		if(rootToNodePath(node.left, val, res)|| 
				rootToNodePath(node.right, val, res))
			return true;
		
		res.remove(res.size() -1);
		return false;
		
	}

}
