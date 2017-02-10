package levelSimple;

import java.util.Scanner;

/* take the input from user, and put it in the array. If one array is filled ,
* take the second array and continue filling, continue upto 5 arrays
*/

public class InputAndPrintArray {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		 String[][] a=new String[20][5];
		
		Scanner s=new Scanner(System.in);
		String input="";
		int i=0,j=0;
		do{
			System.out.println("Enter the string to input");
			input=s.nextLine();
			if(!input.equalsIgnoreCase("end")){
				if(!input.trim().equals("")){
					if(j<5){
						a[i]=fillArray(a[i],input,j);
						j++;
					}else{
						i++;
						j=0;
						a[i]=fillArray(a[i],input,j);
						j++;
					}
				}
				
			}else{
				break;
			}
		}while(true);
		
		for(int k=0;k<i;k++){
			for(int l=0;l<a[k].length;l++){
				System.out.println(a[k][l]);
			}
		}
		for(int l=0;l<j;l++){
			System.out.println(a[i][l]);
		}
		
	}
	private static String[] fillArray(String[] a,String input, int index){
		a[index]=input;
		return a;
	}
}
