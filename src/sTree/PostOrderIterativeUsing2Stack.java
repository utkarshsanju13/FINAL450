package sTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterativeUsing2Stack {
	
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
		
		System.out.println(postOrderIterative(root));
		
	}
	
	public static List<Integer> postOrderIterative(Node root)
	{
		List<Integer> list = new LinkedList<Integer>();
		if(root == null) {
			return list;
		}
		
		Stack<Node> stk1 = new Stack<Node>(); // 2 stack 
		Stack<Node> stk2 = new Stack<>();
		stk1.push(root);//push the root 
		
		while(!stk1.isEmpty())
		{
			/*pop the element from the stk1 then push the left and right of that top element
			then  add the poped element in stk 2
			
			Sequential Pop the element from stk2 and save it to the list,  is the post ORDER*/
			
			Node top = stk1.pop();
			stk2.push(top);
			
			if(top.left!=null)
				stk1.push(top.left);
			
			if(top.right!=null)
				stk1.push(top.right);
		}
		
		while(!stk2.isEmpty()) {
			list.add(stk2.pop().data);
		}	
		return list;
		
	}

}
