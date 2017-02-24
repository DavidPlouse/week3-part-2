/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Administrator
 */
public class MyStack {
    
    extends java.util.ArrayList {
	
	private java.util.ArrayList<Object> list;

	
	
	public MyStack() {
		list = new java.util.ArrayList<Object>();
	}

	
	public void push(Object o) {
		list.add(0, o);
	}

	
	public Object peek() {
		return list.get(0);
	}

	
	public Object pop() {
		Object o = list.get(0);
		list.remove(0);
		return o;
	}

	
	@Override
	public String toString() {
		return "stack: " + list.toString();
}
}
