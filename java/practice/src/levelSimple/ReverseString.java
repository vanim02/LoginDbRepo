package levelSimple;
/**
 * reverse the input string
 */
import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("input the string");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		char[] inputChar=input.toCharArray();
		char[] reverse=new char[inputChar.length];
		int j=inputChar.length-1;
		for(int i=0;i<inputChar.length;i++){
			reverse[i]=inputChar[j];
			j--;
		}
		for(int i=0;i<reverse.length;i++){
			System.out.println(reverse[i]);
		}
		
	}

}
