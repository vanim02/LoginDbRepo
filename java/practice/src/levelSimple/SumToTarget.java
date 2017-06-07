package levelSimple;

public class SumToTarget {

	/**
	 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.
	 */
	public static void main(String[] args) {
		int[] num=new int[]{2,3,4,5,6,9,12};
		int target=11;
		int[] res=findIndecesToTarget(num,target);
		for(int i=0;i<res.length;i++)
		System.out.println(res[i]);
	}
	
	private static int[] findIndecesToTarget(int[] num,int target){
		int[] res=new int[2];
		if(num==null)
			return null;
		else if(num.length==2){
			res[0]=1;
			res[1]=2;
			return res;
		}else{
			int low=0,high=num.length-1;
			while(low<high){
				int sum=num[low]+num[high];
				if(sum==target){
					res[0]=low+1;
					res[1]=high+1;
					break;
				}else if(sum<target){
					low++;
				}else{
					high--;
				}
			}
		}
		return res;
	}
/**
 * O(time): O(n)
 * O(space):  constant
 * abs time: 2n
 * abs space:n[2], 3 integers
 */
}
