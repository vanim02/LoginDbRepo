package leetweek24;

public class DetectCapital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="opT";
		boolean capital=rightCapitalUsed(s);
		System.out.println(capital);
	}
	private static boolean rightCapitalUsed(String s){
		char[] temp=s.toCharArray();
		int cnt=0;
		int index=-1;
		for(int i=0;i<temp.length;i++){
			if(temp[i]<'a'){
				cnt++;
				index=i;
			}
		}
		if(cnt==temp.length || cnt==0 || (cnt==1 && index==0))
			return true;
		return false;
	}
/**
 	*  abs space:n
	 * O(space): n
	 * abs time: 3n+constant
	 * O(time):n
 */
}
