package levelSimple;
/***
 * compare two strings and return extra characters in 2nd string if not equal
 * @author ramulu
 *
 */
public class CompareStrings {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="abcd";
		
		if(s1.length()!=s2.length()){
			System.out.println("-1");
		}else{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			int i=0;
			String res="";
			while(i<ch1.length){
				if(ch1[i]!=ch2[i])
					res+=ch2[i];
				i++;
			}
			if(!res.equals("")){
				System.out.println(res);
			}else
				System.out.println("equal");
		}
	}

}
