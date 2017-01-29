package levelSimple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//disappeared elements in an array from 1 to n, where n is length
public class DisappearedElementsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 4, 3, 2, 7, 7, 8, 2, 3, 1 };
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		if (nums.length > 0) {
			for (int i = 0; i < nums.length; i++) {
				list.add(nums[i]);
			}
			Collections.sort(list);
			Set<Integer> s = new HashSet<Integer>(list);
			System.out.println(s);

			for (int i = 0; i < nums.length; i++) {
				if (!list.contains(i + 1)) {
					res.add(i + 1);
				}
			}
		}
		System.out.println(res);
		// return res;
	}

}