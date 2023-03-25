package sTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfTreeByLevelOrder {
	
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
		
		System.out.println(MaxDepth(root));
	}
	
	public static int MaxDepth(Node root)
	{
	/*	////same as level order traversal
		just maintain a variable level and increment it accordingly*/
		
		Queue<Node> queue = new LinkedList<>();
		int level = 0;		
		
		if(root == null)
			return 0;			
		
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			
			int size = queue.size();
			
			for(int i = 0 ; i < size; i++) {
				
				if(queue.peek().left!=null) {
					queue.offer(queue.peek().left);
				}
				
				if(queue.peek().right!=null) {
					queue.offer(queue.peek().right);
				}
				
				queue.poll();	
			}
			 level++;
		}
		
		return level;
	}

}


 
