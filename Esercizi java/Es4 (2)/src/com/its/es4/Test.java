package com.its.es4;

public class Test {
	public static void main(String[] args) throws NodeExistException, OutOfBoundsException{
		
		
		
		
		
		Tree t = new Tree(2);
		
		
		
		Node root = t.getRoot();
		Node n = t.searchFirst(root, 2);
		System.out.println(n.getVal());
	
		
		
		for(int i = 0; i < 50; i++){
			try{
				t.insertRight(root, 5);
			}
			catch(NodeExistException exception){
				System.out.println(i);
				System.out.println("A node (with val: " + exception.getCurrentNode().getVal() + ") exist in this position, substitution in act");
				t.delete(exception.getCurrentNode());
				t.insertRight(root, 5);
				System.out.println(exception.getCounter());
			}
		}
		
		try{
			t.insertRight(root, 5);
		}
		catch(OutOfBoundsException exception){
			System.out.println("Exception limit exceeded. Action aborted.");
		}
		

		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}
}
