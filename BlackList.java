package com.homework.stack;

import java.util.ArrayList;

public class BlackList {

	private ArrayList<Class<?>> blackList = new ArrayList<Class<?>>();

	public BlackList(ArrayList<Class<?>> blackList) {
		super();
		this.blackList = blackList;
	}

	public BlackList() {
		super();
	}

	public void add (Class<?> one) {
		blackList.add(one);
		System.out.println(one + " added to Blacklist");
	}
	public boolean check(Object object) {
		int checked = 0;
		for (Class<?> class1 : blackList) {
			if (class1.equals(object.getClass())) {
				checked = 1;
			}
		}
		if (checked == 1) {
			return true;
		} else {
		return false;
		}
	}
	
}
