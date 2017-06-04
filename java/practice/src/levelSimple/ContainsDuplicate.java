package levelSimple;

import java.util.HashSet;
/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any 
 * value appears at least twice in the array, and it should return false if every element is distinct.
 * 
 */

public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num=new int[]{1,2,3,4,2};
		boolean res=containsDuplicate(num);
		System.out.println(res);
	}
	
	private static boolean containsDuplicate(int[] num){
		boolean res =false;
		if(num!=null && num.length!=0){
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<num.length;i++){
			if(!hs.contains(num[i])){
				hs.add(num[i]);
			}
		}
		if(num.length==hs.size())
			res= false;
		res= true;
		}
		return res;
	}

}
