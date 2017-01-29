package levelSimple;

public class DisappearedElementsArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find all the numbers b/w 1 and n including the missing 
		//find max and return numbers from 1 to max
		int[] a={4,3,2,7,8,2,3,1};
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		int[] res=new int[max];
		for(int i=0;i<max;i++){
			res[i]=i;
		}
	}

}
