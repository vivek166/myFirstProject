package com.synerzip.javacourceobjective;

public class Factorial {

	public int getFactorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * getFactorial(num - 1);
	}
}
