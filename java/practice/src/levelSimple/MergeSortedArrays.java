package levelSimple;

/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] num1 = new int[] { 1, 2, 3, 0, 0, 0 };

		int[] num2 = new int[] { 2, 5, 6 };// {2,3,8};
		int m = 3;
		int n = 3;
		/*
		 * int[] num1 = new int[] { 0 };
		 * 
		 * int[] num2 = new int[] { 1 }; int m=0;int n=1;
		 */
		if (num1 != null && num2 != null & num1.length > 0 && num2.length > 0) {
			int[] res = new int[num1.length];
			int i = 0, j = 0, k = 0;
			while (i < m && j < n) {
				if ((num2[j] <= num1[i])) {
					res[k++] = num2[j];
					j++;
				} else if (num2[j] > num1[i]) {
					res[k++] = num1[i];
					i++;
				} else {
					res[k++] = num1[i];
					res[k++] = num2[j];
					i++;
					j++;

				}
			}
			while (i == m && j < n) {
				for (int l = j; l < n; l++) {
					res[k++] = num2[j];
					j++;
				}
			}
			while (i < m && j == n) {
				for (int l = i; l < m; l++) {
					res[k++] = num1[i];
					i++;
				}
			}
			int r = 0;
			for (int l = 0; l < res.length; l++) {
				num1[r++] = res[l];

			}
			for (int l = 0; l < num1.length; l++) {
				System.out.println(num1[l]);
			}
		} else {
			System.out.println("null");
		}
	}
}
