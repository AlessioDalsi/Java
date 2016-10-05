package com.its.es4;

public class Tree {
	Node root;
	
	
	public Tree(int val){
		this.root = new Node(val);
		root.setVal(val);
	}
	
	public Node searchFirst(Node currentN, int x){
		if(currentN == null){
			return null;
		}
		if(currentN.getVal() == x){
			return currentN;
			
		}else{
			Node found = searchFirst(currentN.getLeft(), x);
			if(found == null){
				found = searchFirst(currentN.getRight(), x);
			}
			
			return found;
		}
		// Come diavolo ho fatto a non arrivarci prima??
	}
	
	
	
//	if(currentN.getLeft() != null && searchFirst(currentN.getLeft(), x) ){
//		return currentN;
//	}	
//	if(currentN.getRight() != null && searchFirst(currentN.getRight(), x) == currentN){
//		return currentN;
//	}
	
	
	
	
//	public Node searchFirst(Node currentN, int x){
//		if(currentN == null){
//			return null;
//		}
//		if(currentN.getVal() == x){
//			return currentN;
//		}
//		if(currentN.getLeft().getVal() == x){
//			return currentN.getLeft();
//		}	
//		if(currentN.getRight().getVal() == x){
//			return currentN.getRight();
//		}
//		if(currentN.getLeft()!= null){
//			currentN = currentN.getLeft();
//			return searchFirst(currentN, x);
//			
//		}
//		if(currentN.getRight() != null){
//			currentN = currentN.getRight();
//			return searchFirst(currentN, x);
//			
//		}
//		return currentN;
//		
//	}
	int counter = 0;
	
		
	
	
	public Node insertRight(Node node, int n) throws NodeExistException, OutOfBoundsException {
		if (node.getRight() != null){
			
			NodeExistException exception = new NodeExistException();
			OutOfBoundsException OOBexception = new OutOfBoundsException();
				exception.setCurrentNode(node.getRight());
				this.counter ++;
				if(counter < 50){
				throw exception;
				}
				else{
				throw OOBexception;	
				}
		}
		
		Node mynode = new Node(n);
		mynode.setParent(node);
		node.setRight(mynode);
		
		return mynode;
		
	}
	
	public Node insertLeft(Node node, int n) throws NodeExistException{
		if (node.getLeft() != null){
			NodeExistException exception = new NodeExistException();
			exception.setCurrentNode(node.getLeft());
			throw exception;
		}
		
		Node mynode = new Node(n);
		mynode.setParent(node);
		node.setLeft(mynode);
		
		return mynode;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public void update(Node n, int x){
		n.setVal(x);
	}
	
	public void delete(Node n){
		
		if (n.getParent().getLeft() == n){
			n.getParent().setLeft(null); 
			
		}else if (n.getParent().getRight() == n){
			n.getParent().setRight(null);
		}
	
		
		
	}
	
	public void cane() throws OutOfBoundsException{
		OutOfBoundsException a = new OutOfBoundsException();
		throw a;
	}
}
