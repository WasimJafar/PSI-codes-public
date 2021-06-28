package com.sapient.week1;

public class CheckEven {

	public Boolean check(int n) {
		if ((n & 1) == 1) {
			return false;
		} else {
			return true;
		}
	}
}
