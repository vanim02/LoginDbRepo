package leetweek24;

import java.util.HashSet;

/**
 * Given an integer array with even length, where different numbers in this array represent different kinds
 * of candies. Each number means one candy of the corresponding kind. You need to distribute these candies
 * equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 * @author ramulu
 *
 */
public class DistributeCandies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num=new int[]{1,2,2,7,2,1};
		int max=findMaxVarietes(num);
		System.out.println(max);
	}
	private static int findMaxVarietes(int[] num){
		HashSet<Integer> temp=new HashSet<Integer>();
		for(int i=0;i<num.length;i++){
			if(!temp.contains(num[i])){
				temp.add(num[i]);
			}
		}
		if(temp.size()>=num.length/2)
			return num.length/2;
		else
			return temp.size();
		
	}
	/**
 	*  abs space:n
	 * O(space): n
	 * abs time: 2n+constant
	 * O(time):n
 */
}
