package levelSimple;

public class RotateArrays {

	/*
	 * Rotate an array of n elements to the right by k steps.
	 * 
	 * For example, with n = 7 and k = 3
	 */

	public static void main(String[] args) {
		int[] nums = new int[] { 5, 3, 7, 9, 2, 8, 3, 1, 4, 21 };
		int k = 3;
		rotateArrays(nums, k);
	}

	private static void rotateArrays(int[] nums, int k) {

		if (k < nums.length) {
			int[] res = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				if (k == nums.length) {
					k = 0;
				}
				res[k] = nums[i];
				k++;
			}
			for (int i = 0; i < res.length; i++) {
				nums[i] = res[i];
			}

			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}

	}
}
