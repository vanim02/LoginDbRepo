package levelSimple;

public class TrinarySearchIgnore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,14};
		int ele=6;
		int low=0;
		int high = a.length-1;
		int p1=(low+high)/3;
		int p2=p1*2;
		System.out.println(a.length);
		System.out.println(p1);
		System.out.println(p2);
		/*while(){
			if(ele==a[p1] || ele==a[p2]){
				break;
			}else if(ele>a[p1] && ele < a[p2]){
				p1=p1+1;
				p2=p2-1;
			}else if(ele<a[p1]){
				high=p1-1;
			}else if(ele>a[p2]){
				low=p2+1;
			}
		}*/
	}
}
