package levelSimple;

import java.util.Arrays;
//Given two arrays, write a function to compute their intersection.
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
//Note: Each element in the result must be unique.
//The result can be in any order.
public class Intersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] num1 = { 1, 2, 2, 4 };
		// int[] num2 = { 2, 2 };

		int[] num1 = { 8,0,3};
		int[] num2 = { 0,0};
		Arrays.sort(num1);
		Arrays.sort(num2);
		int i = 0, j = 0;
		int size;
		if (num1.length <= num2.length) {
			size = num1.length;
		} else {
			size = num2.length;
		}
		int[] res = new int[size];
		Arrays.fill(res, -1);
		int l = 0;
		if (num1.length != 0 && num2.length != 0) {
			while (i < num1.length && j < num2.length) {
				if (num1[i] < num2[j]) {
					i++;
				} else if (num1[i] > num2[j]) {
					j++;
				} else {
					boolean exists = false;
					for (int k = 0; k < res.length; k++) {
						if (res[k] == num1[i]) {
							exists = true;
							break;
						}
					}
					if (!exists) {
						res[l++] = num1[i];
					}
					i++;
					j++;
				}
			}
		}
		// shrinking the resultant array
		int[] finalRes = new int[l];
		for (int k = 0; k < l; k++) {
			finalRes[k] = res[k];
		}
		for (int k = 0; k < finalRes.length; k++) {
			System.out.println(finalRes[k] + "res");
		}
	}

}
