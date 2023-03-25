package sTree;

import java.util.*;

public class BottomView {
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
		
		System.out.println(bottomView(root));
		
		
	}
	
	public static List<Integer> bottomView(Node root) {
		
		Queue<P> q = new LinkedList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		q.offer(new P(root, 0));
		
		while(!q.isEmpty()) {
			
			P pair = q.poll();
			Node nodeVal = pair.node;
			int vo = pair.vertOrder;
			
			map.put(vo, nodeVal.data);
			
//			if(!map.containsKey(vo)) {
//				map.put(vo, nodeVal.data);
//			}else {
//				map.put(vo, nodeVal.data);
//			}
//			
			if(nodeVal.left!=null) {
				q.offer(new P(nodeVal.left, vo -1));
			}
			
			if(nodeVal.right!=null) {
				q.offer(new P(nodeVal.right, vo + 1));
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
