package com.sapient.day3;

import java.util.*;

public class DeewaliAndRamazan {

	public void getRamzanDates() {

		Calendar calender = Calendar.getInstance();

		calender.set(2021, 4, 13);
		int flag = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(calender.get(Calendar.YEAR) + "/" + calender.get(Calendar.MONTH) + "/"
					+ calender.get(Calendar.DATE));
			if (flag == 3) {
				calender.add(Calendar.DATE, (int) (13 * 29.5));
				flag = 1;
			} else {
				calender.add(Calendar.DATE, (int) (12 * 29.5));
				flag++;
			}
		}

	}

	public static void main(String[] args) {

		DeewaliAndRamazan object = new DeewaliAndRamazan();
		object.getRamzanDates();

	}

}
