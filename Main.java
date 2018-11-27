package com.homework.stack;



public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.getBlackList().add(Integer.class);
		
		stack.add(1);
		stack.add("Hello");
		System.out.println(stack.get());
		System.out.println(stack.getAndDel());
		System.out.println((stack.get()));
	}

}
