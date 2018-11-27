package com.hyx.arithmetic;

public class LinkedList {
	private int size = 0;
	private Node head = null;

	public int size() {
		return size;
	}

	public void add(Object value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}

	public Object get(int index) {
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp = temp.getNext();
		}
		return temp.getValue();
	}

	public void set(int index, Object value) {
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp = temp.getNext();
		}
		temp.setValue(value);
	}

	public void clear() {
		head = null;
		size =0;
	}

	public void remove(int index) {
		if(index == 0) {
			head = head.getNext();
		}
		else {
			Node temp = head;
			for(int i=0;i<index-1;i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		
		size--;
	}
	
	class Node{
		public Node(Object value) {
			this.value = value;
		}
		private Object value;
		private Node next;
		
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
