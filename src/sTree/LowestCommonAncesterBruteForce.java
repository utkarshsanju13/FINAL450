package sTree;

import java.util.ArrayList;

public class LowestCommonAncesterBruteForce {

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
		
		int result = solve(root,root.right.left, root.right.right.right);
		System.out.println(result);
		
	}
	
	public static int solve(Node root, Node node, Node node1) {
		
		/*
		 * In this we find the path of both the node from root itself and then match the
		 * path, print the latest common ancestor
		 */
		
		ArrayList<Integer> pathNode = new ArrayList<Integer>();
		ArrayList<Integer> pathNode1 = new ArrayList<Integer>();
		
		getPath(root, node.data, pathNode);
		getPath(root, node1.data, pathNode1);
		
//		System.out.println(pathNode);
//		System.out.println(pathNode1);
//		
		int l;
		if(pathNode.size() > pathNode1.size())
			l = pathNode.size();
		else
			l = pathNode.size();
		
		for(int i = 0; i < l; i++) {
			
			if(pathNode.get(i)!=pathNode1.get(i))
				return pathNode.get(i-1);
			
		}
		
		return 0;
		
	}
	public static boolean getPath(Node node, int val, ArrayList<Integer> res) {
		
		if(node == null)
			return false;
		
		res.add(node.data);
		
		if(node.data == val)
			return true;
		
		if(getPath(node.left, val, res) || getPath(node.right, val, res))
			return true;
		
		res.remove(res.size() - 1);
		return false;
	}
}
