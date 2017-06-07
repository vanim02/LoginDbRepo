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
		int[] num=new int[]{1,2,31,51,5};
		int ele=findMajority(num);
		System.out.println(ele);
	}
	private static int findMajority(int[] num){
		HashMap<Integer, Integer> temp=new HashMap<Integer, Integer>();
		for(int i=0;i<num.length;i++){
			if(temp.get(num[i])==null)
				temp.put(num[i],1);
			else{
				temp.put(num[i],temp.get(num[i])+1);
				if(temp.get(num[i])>num.length/2)
					return num[i];
			}
		}
		return -1;
	}
	/**
	 *  O(space): O(n)
	 *  abs space: n
	 *  O(time): O(n)
	 *  abs time: 3n
	 */
}
