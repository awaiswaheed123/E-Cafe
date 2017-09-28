package com.awais.eCafe;

import org.junit.Test;

import com.awais.eCafe.Bill;
import junit.framework.TestCase;

public class BillTest extends TestCase {
	
	@Test
	public void test() {
		int[] array = {1,2,3,-1};
		int bill = Bill.generateBill(array);
		 assertEquals(bill, 1950);
	}
	
}
