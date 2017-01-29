package levelSimple;

public class IntersectionOfArrays2 {

	public int[] intersection(int[] nums1, int[] nums2) {
		int nextIndex = 0;
		int size3 = 0;
		if (nums1.length < nums2.length)
			size3 = nums1.length;
		else
			size3 = nums2.length;

		int[] nums3 = new int[size3];

		for (int i = 0; i < nums1.length; i++) { // i=0
			for (int j = 0; j < nums2.length; j++) { // j=1
				if (nums1[i] == nums2[j]) {// nums1[0]=1,nums2[1]=1;
					/*
					 * checkAndAdd(nums1[i],nums3,nextIndex);
					 * System.out.println("nextIndex1:"+nextIndex);
					 */

					// cehcking

					boolean exists = false;
					for (int l = 0; l < nums3.length; l++) {

						if (nums3[l] == nums1[i]) {
							exists = true;
							break;
						}
					}
					int[] finalArray = new int[nums3.length + 1];
					for (int k = 0; k < nums3.length; k++) {
						finalArray[k] = nums3[k];
					}
					// add
					if (!exists) {
						finalArray[nums3.length] = nums1[i];
						for (int m = 0; m < finalArray.length; m++) {
							System.out.println(finalArray[m]);
						}
					}
				}
			}

		}

		return finalArray;
		// return nums3;
	}
    
    

}
