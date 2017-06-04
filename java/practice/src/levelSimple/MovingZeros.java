package levelSimple;

public class MovingZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num=new int[]{13,0,1,2,0,3};
		int[] res=moveZeroes(num);
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
	}
	 public static int[] moveZeroes(int[] num) {
	        int j=0;
		 for(int i=0;i<num.length;i++){
			 if(num[i]!=0){
				 int temp=num[j];
				 num[j]=num[i];
				 num[i]=temp;
				 j++;
			 }
		 }
		 return num;
	   }
}
