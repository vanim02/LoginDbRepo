package leetweek;

public class AddDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8988;
		int sum=findSum(n);
		System.out.println(sum);
	}
	private static int findSum(int n){
		int sum=0;
		if(n<=9)
			sum=n;
		while(n>9){
			 sum=sumDigits(n);
			
			n=sum;
		}
		return sum;
	}

	private static int sumDigits(int n){
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
}
