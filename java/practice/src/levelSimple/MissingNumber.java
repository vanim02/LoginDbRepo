package levelSimple;
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
 * find the one that is missing from the array.
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num=new int[]{0,1,2,3,4,6};
		int res=missingNumber(num);
		System.out.println(res);
	}

	private static int missingNumber(int[] num){
		if(num!=null && num.length!=0){
			int sum=0;
			for(int i=0;i<num.length;i++){
				sum=sum+num[i];
			}
			return (num.length)*(num.length+1)/2 -sum;
		}
		return -1;
	}
}
