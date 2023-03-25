package sTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversalAntiClockwise {
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
		
		List<Integer> res = new ArrayList<>();
		addLeftBoundary(root,res);
		addLeafRightToLeft(root,res);
		addRightBoundary(root, res);
		System.out.println(res);
		
	}
	
	public static boolean isLeaf(Node node)
	{
		if(node.left == null && node.right == null) {
			return true;
		}
		
		return false;
	}
	
	public static void addLeftBoundary(Node node, List<Integer> res)
	{
		res.add(node.data);
		Node curr = node.left;		// root ka left
		while(curr!=null)
		{
			if(isLeaf(curr) == false) {		// check if the node is leave not toh nhi q ki leave node ka ek alag se function hai
				res.add(curr.data);			// if not then add to res
			}
			
			if(curr.left != null)		// check if left is present 
				curr = curr.left;		// then go to left
			else
				curr = curr.right;		// else go to right				
		}
	}

	public static void addRightBoundary(Node node, List<Integer> res)
	{
		Node curr = node.right;
		Stack<Node> temp = new Stack<>();
		
		while(curr!= null)
		{
			if(isLeaf(curr) == false) {
				temp.push(curr);
			}
			
			if(curr.right != null) {
				curr = curr.right;
			}else
				curr = curr.left;
		}
		
		
		while(!temp.isEmpty())
		{
			res.add(temp.pop().data);
			
		}
		
	}
	
	public static void addLeafRightToLeft(Node node, List<Integer> res)
	{
		//using the pre order traversal we can print the leaf node from left to right
		
		Stack<Node> stk = new Stack<>();
		stk.push(node);
		
		while(!stk.isEmpty()) {
			
			Node top = stk.pop();
			
			if(isLeaf(top)) {
				res.add(top.data);	
			}
			
			if(top.right!=null)
				stk.push(top.right);
			
			if(top.left!=null)
				stk.push(top.left);
		}
	}
}
