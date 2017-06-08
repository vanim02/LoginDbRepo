package levelSimple;

import java.util.HashMap;

/**
 * Given an array of size n, find the majority element.
 *  The majority element is the element that appears more than n/2 times.
 *  You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 */
public class MajorityElement {

	public static void main(String[] args) {
		int[] num=new int[]{1,2,2,2,5};
		int ele=findMajority(num);
		System.out.println(ele);
	}
	private static int findMajority(int[] num){
		HashMap<Integer, Integer> temp=new HashMap<Integer, Integer>();
		int res=-1;
		 		for(int i=0;i<num.length;i++){
			 		if(temp.get(num[i])==null)
			 			temp.put(num[i],1);
			 		else{
			 			int freq=temp.get(num[i]);
			 			temp.put(num[i],freq+1);
 			 			if(freq+1>num.length/2)
 			 			return num[i];
			 		}
			 	}
		 		return res;
	}
	/**
	 *  O(space): O(n)
	 *  abs space: n+1
	 *  O(time): O(n)
	 *  abs time: 4n
	 */
}
