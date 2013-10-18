package com.Minsup;
import java.util.*;

public class Tree<T> {
	private Node<T> root;
	public int n_ary;
	
	public void Tree(T rootdata, int n_ary) {
		root = new Node<T>();
		root.value = rootdata;
		root.parent = null;
		root.children = new ArrayList<Node<T>>(n_ary);
		this.n_ary = n_ary;
	}
	
	public void insert(T value) {
		
	}
	
	public void delete(T value) {
		
	}
	public class Node<T> {
		public T value;
		public Node<T> parent;
		public ArrayList<Node<T>> children;
	}

}

/*
public class Tree<T> {
private Node<T> root;

public Tree(T rootData) {
    root = new Node<T>();
    root.data = rootData;
    root.children = new ArrayList<Node<T>>();
}

public static class Node<T> {
    private T data;
    private Node<T> parent;
    private List<Node<T>> children;
}
}
*/