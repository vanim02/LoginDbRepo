package levelSimple;

import java.util.Scanner;
/*
 * take the input from user, and put it in the array. If one array is filled ,
 * take the second array and continue filling
 * 
 */
public class InputAndPrintTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a=new String[5];
		String[] b=new String[5];
		Scanner s=new Scanner(System.in);
		String input="";
		int i=0;
		do{
			System.out.println("Enter the string");
			input=s.nextLine();
			if(!input.equalsIgnoreCase("end")){
				if(!input.equals("")){
					if(i<a.length){
						a[i]=input;
						i++;
					}else{
						b[i-5]=input;
						i++;
					}
				}
			}else{
				break;
			}
		}while(true);
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
		
	}

}
