package sTree;

import java.util.*;

public class Right_LeftView {

	public static void main(String[] args) {
		

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
//		root.right.right.left.left = new Node(19);
		root.right.right.right = new Node(10);
//		root.right.right.right.right = new Node(110);
	
		List<Integer> rightView = new ArrayList<>();
		List<Integer> leftView = new ArrayList<>();
		
		rightView(root, 0, rightView);
		leftView(root, 0, leftView);
		System.out.println("RIGHT VIEW : "+rightView);
		System.out.println("LEFT VIEW : "+leftView);
		
		
	}
	
	public static void rightView(Node node, int level, List<Integer> result) {
		
		if(node == null) {
			return ;
		}
		
		if(level == result.size()) {
			result.add(node.data);
		}
		
		rightView(node.right, level+1, result);
		rightView(node.left, level+1 , result);
	}
	
	public static void leftView(Node node, int level, List<Integer> result) {
		
		if(node == null) {
			return;
		}
		
		if(level == result.size()) {
			result.add(node.data);
		}
		
		leftView(node.left, level+1, result);
		leftView(node.right, level+1, result);
	}
}
