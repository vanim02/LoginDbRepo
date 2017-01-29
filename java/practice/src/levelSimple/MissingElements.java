package levelSimple;
import java.util.Arrays;

public class MissingElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a=new int[]{4,3,2,7,8,2,3,1};
		//1.sort, 2.remove duplicates 3.find absent element
		
		Arrays.sort(a);
		System.out.println("Sorted elements of array");
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		int[] temp=new int[a.length];
		int j=0;
		temp[0]=a[0];
		j++;
		for(int i=1;i<a.length;i++){
			if(!(a[i]==a[i-1])){
				temp[j]=a[i];
				j++;
			}
		}
		int[] uniq=new int[j];
		int k=0;
		System.out.println("Unique elements of array");
		for(int i=0;i<j;i++){
			uniq[k]=temp[i];
			k++;
		}
		for (int i=0;i<uniq.length;i++){
			System.out.println(uniq[i]+" ");
		}
		int[] dis=new int[uniq.length];
		k=0;
		for (int i=0;i<uniq.length;i++){
			if(!(uniq[i]==i+1)){
				dis[k]=i+1;
				k++;
			}
			
		}
		System.out.println("Missing elements of array");
		int[] res=new int[k];
		for (int i=0;i<k;i++){
			res[k]=dis[k];
		}
		
	}

}
