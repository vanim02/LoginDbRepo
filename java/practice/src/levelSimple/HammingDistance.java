package levelSimple;
/**
 * hamming distance
 * how many bits differ with corresponding bits of other number
 * @author ramulu
 *
 */

public class HammingDistance {

	/**
	 * @param 
	 */
	public static void main(String[] args) {
		int x=128,y=1;
		int hamming = hammingDistance(x,y);
	}
	private static int hammingDistance(int x, int y){

		int[] a=new int[32];
		int[] b=new int[32];
		
		int i=31,j=31;
		
			if(x!=0){
				while(x!=1){
					int r=x%2;
					a[i--]=r;
					x=x/2;
				}
				a[i--]=1;
			}
			if(y!=0){
				while(y!=1){
					int r=y%2;
					b[j--]=r;
					
					y=y/2;
				}
				b[j--]=1;
			}
			int c=0;
			for(int k=0;k<a.length;k++){
				System.out.println(a[k]);
			}
			System.out.println("ffffffff");
			for(int k=0;k<b.length;k++){
				System.out.println(b[k]);
			}
			for(int k=0;k<a.length;k++){
				if(a[k]!=b[k]){
					c++;
				}
			}
			System.out.println("hamming ="+c);
			return c;
		
	
	}
}
