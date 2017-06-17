package leetweek24;

import java.util.HashMap;

public class FirstUniqueCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="loeleeoe";
		int index=findFirstUnique(s);
		System.out.println(index);
	}
	private static int findFirstUnique(String s){
		HashMap<Character, Integer> temp=new  HashMap<Character, Integer>();
		char[] input=s.toCharArray();
		for(int i=0;i<input.length;i++){
			if(temp.get(input[i])==null){
				temp.put(input[i], 1);
			}else{
				temp.put(input[i], temp.get(input[i])+1);
			}
		}
		for(int i=0;i<input.length;i++){
			if(temp.get(input[i])==1)
				return i;
		}
		return -1;
	}
	/**
 	*  abs space:2n
	 * O(space): n
	 * abs time: 2n+n
	 * O(time):n
 */
}
