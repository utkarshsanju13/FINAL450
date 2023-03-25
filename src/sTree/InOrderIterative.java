package sTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InOrderIterative {

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
		
		List<Integer> list = inOrderIterative(root);
		System.out.println("IN ORDER: "+ list);
	}
	
public static List<Integer> inOrderIterative(Node root){
		
		List<Integer> result = new LinkedList<Integer>();
		if(root == null)
			return result;
		
		Stack<Node> stk = new Stack<>();
		Node node = root; // maintain last visited node value
		while(true) {
			
			if(node != null) { // first go to the left most 
				stk.push(node);
				node = node.left; // maintain last visited node value
			}
			else {						// if the node is null
				if(stk.isEmpty())
					break;

				Node top = stk.pop();  // pop the top element 
				result.add(top.data);		// top element is added
				node = top.right;     // check if its right exit or not .....
										
			}
		}
		return result;
	}
}
