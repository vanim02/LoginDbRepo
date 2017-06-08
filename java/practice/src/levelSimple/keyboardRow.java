package levelSimple;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * @author ramulu
 *
 */
public class keyboardRow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> input=new ArrayList<String>();
		 input.add("Hello");
		 input.add("Alaska");
		 input.add("Dad");
		 input.add("Peace");
		 input.add("try");
		 List<String> output=new ArrayList<String>();
		output=isSameRow(input);
			System.out.println(output);
	}
	private static List<String> isSameRow(List<String> input){
	
		String s1="qwertyuiop";
		String s2="asdfghjkl";
		String s3="zxcvbnm";
		List<String> output=new ArrayList<String>();
		boolean valid;
		int k=0;
		for(int i=0;i<input.size();i++){
			char[] c=input.get(i).toLowerCase().toCharArray();
			if(s1.indexOf(c[0])>=0){
				 valid=isValid(s1,c);
			}else if(s2.indexOf(c[0])>=0){
				 valid=isValid(s2,c);
			}else{
				 valid=isValid(s3,c);
			}
			if(valid){
				output.add(input.get(i));
//				System.out.println(input[i]);
			}
		}
		return output;
	}

	private static boolean isValid(String s,char[] c) {
		boolean valid=true;
		for(int j=0;j<c.length;j++){
			if(!(s.indexOf(c[j])>=0)){
				valid=false;
				break;
			}
		}
		return valid;
	}
	
}
