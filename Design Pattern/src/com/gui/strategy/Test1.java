package com.gui.strategy;

import java.util.Comparator;
import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		User user = new User();
		user.play(Type.Ali_Pay, 20);
		
		Comparator<Duck> comparator = new Comparator<Duck>() {

			@Override
			public int compare(Duck o1, Duck o2) {
				// TODO Auto-generated method stub
				return o1.get() - o2.get();
			}
			
		};
		
		System.out.println(comparator.compare(new Duck(15), new Duck(20)));
	}

}
