package com.its.es4.test;

import static org.junit.Assert.*;
import com.its.es4.MyException;
import com.its.es4.Node;
import com.its.es4.Tree;


import org.junit.Test;

public class TreeTest {

	@Test
	public void test() {
		Tree t = new Tree(2);
		Node root = t.getRoot();
		Node n = t.searchFirst(root, 2);
		System.out.println(n.getVal());
		t.insertLeft(root,  3);
		Node nx = t.insertRight(root, 3);
		Node a = t.insertLeft(nx, 3);
		t.insertRight(a, 5);
		
		
		
		
		Node n5 = t.searchFirst(root, 5);
		System.out.println(n5.getVal());
		t.delete(n5);
		
		t.update(nx, 10);
		Node n3 = t.searchFirst(root, 3);
		
		assertEquals(2, t.searchFirst(root, 2).getVal());
		assertEquals(5, t.searchFirst(root, 5).getVal());
		
		try{
			t.insertLeft(root, 5);
			
			
			
		}catch(MyException e){
			
		}
		
	}

}
