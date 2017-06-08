package levelSimple;
/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n]
and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * @author ramulu
 *
 */
public class FirstBadVersion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10;
		int res=firstBadVersion(n);
		System.out.println(res);
	}	
	private static int firstBadVersion(int n){

		 int low = 1, high = n;
		    while (low < high) {
		        int mid = low + high/ 2;
		        if (!isBadVersion(mid))
		        	low = mid + 1;
		        else high = mid;            
		    }        
		    return low;
	
	}
	/**
	 * abs space:3
	 * O(space): const
	 * abs time: less than n
	 * O(time): O(log n)
	 */
}
