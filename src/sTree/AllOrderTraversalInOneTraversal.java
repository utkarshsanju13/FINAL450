package sTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Pair{
	
	int num;
	Node node;
	
	public Pair(Node node, int num) {
		num = num;
		node = node;
	}
	
	}

public class AllOrderTraversalInOneTraversal {

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		
		AllOrderInOneTraversal(root);
		
		
	}
	
	public static void AllOrderInOneTraversal(Node root) {
		
		List<Integer> preOrder = new LinkedList<>();
		List<Integer> inOrder = new LinkedList<>();
		List<Integer> postOrder = new LinkedList<>();
		
		if(root == null)
			return;
		 
		Stack<Pair> stk = new Stack<>();
		stk.push(new Pair(root, 1));
		
		while(!stk.isEmpty())
		{
			Pair top = stk.pop();
			if(top.num == 1) {
				preOrder.add(top.node.data);
				top.num++;
				stk.push(top);
				
				if(top.node.left != null)
					stk.push(new Pair(top.node.left, 1));
				
			}
			else if(top.num == 2) {
				inOrder.add(top.node.data);
				top.num++;
				stk.push(top);
				
				if(top.node.right != null) {
					stk.push(new Pair(top.node.right, 1));
				}
			}
			
			else {
				postOrder.add(top.node.data);
			}
			
		}
		
		System.out.println("PreOrder"+ preOrder);
		System.out.println("InOrder"+ inOrder);
		System.out.println("PostOrder"+ postOrder);
		
	}
}
