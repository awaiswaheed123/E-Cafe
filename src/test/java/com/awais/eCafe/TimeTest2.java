package com.awais.eCafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest2 {

	@Test
	public void test() {
		int[] array = {1,2,3,-1};
		int time = Bill.generateTime(array, 2);
		 assertEquals(time, 26);
	}

}
