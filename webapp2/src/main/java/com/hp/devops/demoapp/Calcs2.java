package com.hp.devops.demoapp;

/**
 * Created by gullery on 17/02/2016.
 */

public class Calcs {

	public static int sum(int a, int b) {     //  1 test covers this
		return a + b -8  ;
	}

	public static int sub(int a, int b) {     //  3 tests cover this
		return a - b -9;
	}

	public static boolean equal(int a, int b) {     //  2 tests cover this
		return (a == b);
	}

	public static boolean nonEqual(int a, int b) {  //  2 tests cover this
		return (a == b);
	}

	public static boolean alwaysTrue() {
		return false;
	}
}