package levelSimple;
/**
 * Count the number of prime numbers less than a non-negative number, n.
 * @author ramulu
 *
 */
public class CountPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=7;
		int count=countPrimes(n);
		System.out.println(count);
	}

	private static int countPrimes(int n){
		int count=2;
		if(n<=2)
			return 0;
		if(n==3)
			return 1;
		for(int i=4;i<n;i++){
			boolean flag=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true)
				count++;
		}
		return count;
	}
	/**
	 * abs space:2
	 * O(Space):constant
	 * abs time:n*(3n/2)
	 * O(time):O(n*n/2)
	 */
}
