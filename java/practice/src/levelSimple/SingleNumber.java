/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
package levelSimple;

import java.util.HashMap;

public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num=new int[]{2,7,11,15,2,11,15,7,3};
		int result = findSingleNum(num);
		System.out.println(result);
		result = optimumSolutionSingleNum(num);
		System.out.println(result);
	}
	
	
	private static int findSingleNum(int[] num){
		int result=0;
		if(num.length==0)
				result= -1;
		else if(num.length==1)
			result= num[0];
		else{
			HashMap<Integer, Integer> temp=new HashMap<Integer, Integer>();
			result=0;
			for(int i=0;i<num.length;i++){
				if(temp.get(num[i])==null){
					temp.put(num[i],1);
					result=result+num[i];
				}else{
					result=result-num[i];
				}
			}
		}
		return result;
	}
	
	private static int optimumSolutionSingleNum(int[] num){
		int result=0;
			for(int i=0;i<num.length;i++)
				result ^=num[i];
		return result;
	}
}
