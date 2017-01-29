package levelSimple;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a=new int[]{2,3,4,5,6,7,9,12};
		int ele=1;
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a[mid]==ele){
				System.out.println("element found at "+mid);
				break;
			}else if(ele<a[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		if(low>high)
			System.out.println("element not found");
	}

}
