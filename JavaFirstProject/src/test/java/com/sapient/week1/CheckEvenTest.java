package com.sapient.week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckEvenTest {

	CheckEven checkEven;

	public CheckEvenTest() {
		checkEven = new CheckEven();
	}

	@Test
	public void check_Even_1() {
		int num = 100;
		boolean res = checkEven.check(num);
		assertTrue(res);
	}

	@Test
	public void check_Even_2() {

		int num = 101;
		boolean res = checkEven.check(num);
		assertFalse(res);
	
	}

	@Test
	public void check_Even_3() {

		int num = 468;
		boolean res = checkEven.check(num);
		assertTrue(res);
	
	}

	@Test
	public void check_Even_4() {

		int num = 3245;
		boolean res = checkEven.check(num);
		assertFalse(res);
	
	}

	@Test
	public void check_Even_5() {

		int num = 893257;
		boolean res = checkEven.check(num);
		assertFalse(res);
	
	}

}
