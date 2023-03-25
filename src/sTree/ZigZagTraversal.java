package sTree;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
	
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
		
		System.out.println(zigZagTraversal(root));
	}
	
	public static List<List<Integer>> zigZagTraversal(Node node){
		
/*		same as level order the small change is that the maintain a variable flag and if flag is true then left to right 
		and if flag is false then right to left( reverse the list)*/
		
		Queue<Node> queue = new LinkedList<>();
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		boolean leftToRight = true;
		if(node == null)
			return result;
		
		queue.offer(node);
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			List<Integer> sublist = new LinkedList<>();
			
			for(int i = 0 ; i < size; i++) {
				Node top = queue.poll();
				
				if(top.left!=null)
					queue.offer(top.left);
				if(top.right!=null)
					queue.offer(top.right);
				
				sublist.add(top.data);
			}
			
			if(leftToRight == false) {
				Collections.reverse(sublist);
			}
			
			result.add(sublist);
			leftToRight = !leftToRight;
			
		}
		
		return result;
		
	}
	
}
