package com.its.es4;

public class NodeExistException extends Exception{

	private Node currentNode;
	private int counter = 0;
	
	
	

	

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Node getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(Node currentNode) {
		this.currentNode = currentNode;
	}
	
	
	
}
