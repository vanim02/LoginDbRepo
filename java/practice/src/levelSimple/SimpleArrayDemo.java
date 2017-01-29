package levelSimple;

import java.util.Scanner;


public class SimpleArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create array
		int[] c=new int[10];
		// read array
		int[] a={1,2,3,4,5};
		for (int i=0;i<a.length;i++){
				System.out.println(a[i]+" ");
	
		}
		
		//insert into array
		int[] b=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter input values");
		for(int i=0;i<b.length;i++){
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]+" ");
		}
		
		//update array elements . replace last element
		
		for(int i=0;i<b.length;i++){
			if(i==b.length-1){
				b[i]=100;
			}
		}
		System.out.println("updated values");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		//delete element from array
		int[] d=new int[b.length-1];
		
		for(int i=0;i<b.length;i++){
			if(!(b[i]==100)){
				d[i]=b[i];
			}
		}
		System.out.println("deleted values");
		
		for(int i=0;i<d.length;i++){
			System.out.println(d[i]);
		}
		
		//Merge two arrays
		int[] m=new int[a.length+b.length];
		System.out.println("***m size="+m.length);
		int i=0;
		for( i=0;i<a.length;i++){
			m[i]=a[i];
			System.out.println("***i="+i);
		}
		
		System.out.println("i="+i);
		for(int j=0;j<b.length;j++){
			m[i]=b[j];
			i++;
			System.out.println("***i="+i);
		}
		System.out.println("Merged values");
		
		for(int k=0;k<m.length;k++){
			System.out.println(m[k]);
		}
		
		//common elements 
		int size=a.length;
		if(b.length<a.length){
			size=b.length;
		}
		int[] comm=new int[size];
		int l=0;
		for(int j=0;j<a.length;j++){
			for(int k=0;k<b.length;k++){
				if(a[j]==b[k]){
					comm[l]=a[j];
					l++;
				}
			}
		}
		
		System.out.println("Common values");
		for(int k=0;k<comm.length;k++){
			System.out.println(comm[k]);
		}
		
		//Reverse the array
		int[] rev=new int[a.length];
		int index=a.length-1;
		for(int k=0;k<a.length;k++){
			rev[index]=a[k];
			index--;
		}
		System.out.println("Reversed array");
		for(int k=0;k<rev.length;k++){
			System.out.println(rev[k]);
		}
		
	}

}
