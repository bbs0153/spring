package com.bit.util;

public class BitUtil {

	public int getMax(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 38, 5, 8, 13, 21, 7 };
		BitUtil bu = new BitUtil();
		int r = bu.getMax(arr);

		System.out.println("Å«¼ö´Â:" + r);

	}
}
