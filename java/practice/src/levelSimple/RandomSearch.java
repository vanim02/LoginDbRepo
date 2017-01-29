package levelSimple;

import java.util.Random;

public class RandomSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 4, 5, 6, 7, 9, 12 };
		int ele = 13;
		int low = 0, high = a.length - 1;
		Random r=new Random();
		while(low<=high){
			int p=r.nextInt(high - low + 1) + low;
			System.out.println(p);
			if(a[p]==ele){
				System.out.println("found");
				break;
			}else if(ele<a[p]){
				high=p-1;
			}else{
				low=p+1;
			}
		}
	}

}
