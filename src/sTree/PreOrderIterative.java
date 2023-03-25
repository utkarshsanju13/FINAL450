package sTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
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
		
		List<Integer> list = preOrderIterative(root);
		System.out.println("PRE ORDER: "+ list);
		
	}
	
	public static List<Integer> preOrderIterative(Node root) {
		
		List<Integer> result = new LinkedList<Integer>();
		if(root == null)
			return result;
		
		Stack<Node> stk = new Stack<>();
		stk.push(root);
		
		while(!stk.isEmpty()) {
			
			Node top = stk.pop();
			
			if(top.right != null)
				stk.push(top.right);
			
			if(top.left != null)
				stk.push(top.left);
			
			 result.add(top.data);
		}
		return result;
	}
	
	
}
