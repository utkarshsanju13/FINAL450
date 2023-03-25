package sTree;
 import java.util.*;

 class Tuple{
	Node node;
	int vo;
	int level;
	
	public Tuple(Node node, int vo, int level) {
		this.node = node;
		this.vo = vo;
		this.level = level;
	}
}

public class VerticalOrderIteration {
	
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
		
		System.out.println(verticalOrder(root));
		
	}
	
	public static List<List<Integer>> verticalOrder(Node node) {
		 
		TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
		Queue<Tuple> queue = new LinkedList<>();
		
		queue.offer(new Tuple(node, 0, 0));
		
		while(!queue.isEmpty()) {
			Tuple tuple = queue.poll();
			
			Node val = tuple.node;
			int vo = tuple.vo;
			int level = tuple.level;
			
			if(!map.containsKey(vo)) {
				map.put(vo, new TreeMap<>());
			}
			
			if(!map.get(vo).containsKey(level)) {
				map.get(vo).put(level, new PriorityQueue<>());
			}
			
			map.get(vo).get(level).offer(val.data);
			
			
			if(val.right!=null) {
				queue.offer(new Tuple(val.right, vo + 1, level +1));
			}
			
			if(val.left!=null) {
				queue.offer(new Tuple(val.left, vo - 1, level+1));
			}
			
		}
		
//		System.out.println(map);
		
		List<List<Integer>> list = new ArrayList<>();
		
		for(TreeMap<Integer, PriorityQueue<Integer>> ys: map.values()) {
			list.add(new ArrayList<>());
			
			for(PriorityQueue<Integer> nodeval: ys.values()) {
				while(!nodeval.isEmpty()) {
					System.out.println(nodeval.peek());
					list.get(list.size()-1).add(nodeval.poll());
				}
			}
		}
		
		return list;
	}

}
