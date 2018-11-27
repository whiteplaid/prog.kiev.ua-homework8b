package com.homework.stack;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Object> stack = new ArrayList<Object>();
	private BlackList blackList = new BlackList();
	public Stack(ArrayList<Object> stack, BlackList blackList) {
		super();
		this.stack = stack;
		this.blackList = blackList;
	}
	public Stack() {
		super();
	}

	public BlackList getBlackList() {
		return blackList;
	}
	public void add (Object object) {
		if (!getBlackList().check(object)) {
			stack.add(object);
			System.out.println(object + " succesfully added");
		} else {
			System.out.println(object + " can not be added due to Class restriction");
		}
	}
	public Object get() {
		Object object = null;
		try {
		object = stack.get(stack.size()-1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is Empty");
		}
		return object;
	}
	public Object getAndDel () {
		Object object = null;
		try {
		object = stack.get(stack.size()-1);
		stack.remove(object);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nothing to delete");
		}
		return object;
	}
	
}
