package leetweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and
for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.
 * @author ramulu
 *
 */
public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println("input the n value");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		List<String> list = new ArrayList<String>();
		
		list = fizzBuzz(n);
		System.out.println(list);
		
	}

	private static List<String> fizzBuzz(int n){
		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++){
			if((i+1)%3==0 && (i+1)%5==0){
				list.add("\"FizzBuzz\"");
				
			}else if((i+1)%3==0 ){
				list.add("\"Fizz\"");
			}else if((i+1)%5==0){
				list.add("\"Buzz\"");
			}else{
				list.add("\""+(i+1)+"\"");
			}
		}
		return list;
	}
}
