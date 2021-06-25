package com.sapient.day3;

public class ConvertFiguresToWords {

	private final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
			"Twenty" };
	private final String[] place = { "Crore", "Lakh", "Thousand", "Hundred", "Only" };
	private final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	private final Long[] nValues = { 10000000l, 100000l, 1000l, 100l, 1l };

	StringBuilder stringBuilder = new StringBuilder();

	public String converFigureToWords(Long num) {

		for (int i = 0; i < nValues.length; i++) {

			int n = (int) (num / nValues[i]);

			num = num % nValues[i];

			if (n != 0) {

				if (n < 20) {
					stringBuilder.append(ones[n]).append(" ").append(place[i]).append(" ");
				}

				else {

					stringBuilder.append(tens[n / 10]).append(" ").append(ones[n % 10]).append(" ").append(place[i])
							.append(" ");

				}

			}

		}

		return stringBuilder.toString();
	}

	public static void main(String[] args) {

		ConvertFiguresToWords object = new ConvertFiguresToWords();
		System.out.println(object.converFigureToWords(123456l));

	}

}
