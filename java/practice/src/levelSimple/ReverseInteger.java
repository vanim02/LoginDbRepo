package levelSimple;
/**
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

Note:
The input is assumed to be a 32-bit signed integer.
 Your function should return 0 when the reversed integer overflows
 */
public class ReverseInteger {

	public static void main(String[] args) {
		int num=1234567898;
		int rev=reverseInteger(num);
		System.out.println(rev);
	}
	private static int reverseInteger(int num){
		boolean neg=false;
		if(num<0){
			neg=true;
		}
		num=Math.abs(num);
		int rev=0;
		while(num>0){
			rev=rev*10+num%10;
			num=num/10;
		}
		if(neg)
		return -rev;
		return rev;
	}
	/**
	 * 
	 * abs space: 1
	 * O(space): constant
	 * abs time: 2*digits
	 * O(time): O(no. of digits)
	 */
}
