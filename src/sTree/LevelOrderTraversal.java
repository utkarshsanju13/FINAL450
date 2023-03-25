package sTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	
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
		
		List<List<Integer>> l = levelOrderTraversal(root);
		System.out.println(l);
		
	}

	private static List<List<Integer>> levelOrderTraversal(Node root) {
		
		Queue<Node> queue = new LinkedList<Node>(); // maintaining a queue for the tree nodes
		List<List<Integer>> result = new LinkedList<List<Integer>>(); // result list 
		if(root == null)
			return result;
		queue.offer(root);   //initially root is inserting in queue
		
		while(!queue.isEmpty()) {			
			
			int size = queue.size();    // how many elements are there in queue that all are at same level
			List<Integer> sublist = new LinkedList<Integer>();  // a sublist of particular level
			
			for(int i = 0 ; i < size; i++) {
				if(queue.peek().left != null)
					queue.offer(queue.peek().left);		//check if the left child is present or not and entring it in the queue for next level
				if(queue.peek().right!= null)
					queue.offer(queue.peek().right);  //---same for right
				
				 sublist.add(queue.poll().data);
			}
			
			result.add(sublist);
		}
		
		return result;
		
		
		
		
		
		
	}

}
