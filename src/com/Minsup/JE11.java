package com.Minsup;

public class JE11 {
	public static void main(String[] args) {
		// Make a mirror of binary tree
		
		// First make a binary tree
		BinaryNode<Integer> root = new BinaryNode<>();
		root.value = 1;
		root.parent = null;
		
		root.left = new BinaryNode<>();
		root.left.value = 2;
		root.left.parent = root;
		root.right = new BinaryNode<>();
		root.right.value = 3;
		root.right.parent = root;
		
		root.left.left = new BinaryNode<>();
		root.left.left.value = 4; 
		root.left.left.parent = root.left;
		root.left.left.left = root.left.left.right = null;
		
		root.left.right  = new BinaryNode<>();
		root.left.right.value = 5;
		root.left.right.parent = root.left;
		root.left.right.left = root.left.right.right = null;
		
		root.right.left = new BinaryNode<>();
		root.right.left.value = 6; 
		root.right.left.parent = root.right;
		root.right.left.left = root.right.left.right = null;
		
		root.right.right  = new BinaryNode<>();
		root.right.right.value = 7;
		root.right.right.parent = root.right;
		root.right.right.left = root.right.right.right = null;
		
		// Make a mirror of it
		BinaryNode<Integer> root2 = null;// = new BinaryNode<>();
		root2 = MakeMirror(root);
		
		System.out.println(root2.value);
		System.out.println(root2.left.value);
		System.out.println(root2.right.value);
		System.out.println(root2.left.left.value);
		System.out.println(root2.left.right.value);
		System.out.println(root2.right.left.value);
		System.out.println(root2.right.right.value);
	}
	
	static BinaryNode<Integer> MakeMirror(BinaryNode<Integer> root) {
		BinaryNode<Integer> root2=null;
		if(root==null) return null;

		if(root2==null) {
			root2 = new BinaryNode<>();
			root2.value = root.value;
		}
		root2.right = MakeMirror(root.left);
		root2.left = MakeMirror(root.right);

		return root2;
	}
	
}
