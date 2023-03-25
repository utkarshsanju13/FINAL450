package sTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversalClockWise {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
//		root.left.left.left = new Node(12);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		
		List<Integer> res = new ArrayList<>();
		addRightBoundary(root, res);
		addLeafRightToLeft(root, res);
		addLeftBoundary(root,res);
		System.out.println(res);
		
		
	}
	
	public static boolean isLeaf(Node node) {
		if(node.left == null && node.right == null)
			return true;
		
		return false;
	}
	
	public static void addRightBoundary(Node node, List<Integer> res) {
		
		res.add(node.data);
		Node curr = node.right;
		
		while(curr!=null) {
			
			if(!isLeaf(curr)) {
				res.add(curr.data);
			}
			
			if(curr.right!=null)
				curr = curr.right;
			else
				curr = curr.left; 
		}
	}
	
	public static void addLeafRightToLeft(Node node, List<Integer> res) {
		
		Stack<Node> stk = new Stack<>();
		stk.push(node);
		
		while(!stk.isEmpty()) {
			
			Node top = stk.pop();
			
			if(isLeaf(top)) {
				res.add(top.data);	
			}
			
			if(top.left!=null)
				stk.push(top.left);
			
			if(top.right!=null)
				stk.push(top.right);
			
			
		}
	}
	
	public static void addLeftBoundary(Node node, List<Integer> res) {
		
		Node curr = node.left;
		
		Stack<Integer> temp = new Stack<>();
		
		
		while(curr!=null) {
			
			if(!isLeaf(curr)) {
				temp.push(curr.data);
			}
			
			if(curr.left!=null)
				curr = curr.left;
			else
				curr = curr.right;
		}
		
		while(!temp.isEmpty()) {
			res.add(temp.pop());
		}
	}

}
