package sTree;

import java.util.*;

class P{
	Node node;
	int vertOrder;
	
	public P(Node node, int vertOrder) {
		this.node = node;
		this.vertOrder = vertOrder;
	}
}
public class TopView {
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
		
		System.out.println(topView(root));
		
		
	}
	
	public static List<Integer> topView(Node root) {
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<P> queue = new LinkedList<>();
		
		queue.offer(new P(root, 0));
		
		while(!queue.isEmpty()) {
//			System.out.println(queue);
			P pair = queue.poll();
			
			Node nodeVal = pair.node;
			int vertOrder = pair.vertOrder;
			
			if(!map.containsKey(vertOrder)) {
				map.put(vertOrder, nodeVal.data);
			}
			
			if(nodeVal.left!=null) {
				queue.offer(new P(nodeVal.left, vertOrder - 1));
			}
			
			if(nodeVal.right!=null) {
				queue.offer(new P(nodeVal.right, vertOrder + 1));
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for(Integer ys: map.values()) {
			System.out.println(ys);
			list.add(ys);
		}
	return list;	
	}

}
