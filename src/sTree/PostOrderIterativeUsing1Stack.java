package sTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterativeUsing1Stack {
	
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
	
	public static List<Integer> postOrderIterative(Node root){
		
		List<Integer> list = new LinkedList<>();
		
		if(root == null) {
			return list;
		}
		
		Stack<Node> stk = new Stack<>();	
		Node curr = root;
		
		while(curr!=null || !stk.isEmpty()) {
			
			if(curr != null) {
				stk.push(curr);
				curr = curr.left;
			}
			else {
					Node temp = stk.peek().right;
					
					if(temp == null) {
						
						temp = stk.peek();
						list.add(stk.pop().data);
						
						while(!stk.isEmpty() && temp == stk.peek().right) {
							
							temp = stk.peek();
							list.add(stk.pop().data);
						}
						
					}else {
						curr = temp;
					}
				
			}
		}
		return list;
		
	}

}
