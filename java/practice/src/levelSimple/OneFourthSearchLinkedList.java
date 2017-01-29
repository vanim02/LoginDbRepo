package levelSimple;

import java.util.LinkedList;
import java.util.List;

public class OneFourthSearchLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(16);
		
		int low=0,high=list1.size()-1,ele=16;
		int p=0;
		boolean found=false;
		while(low<=high){
			int inc=(high-low)/4;
			if(inc==0){
				break;
			}else{
				p=p+inc;
				System.out.println(p);
				if(ele==list1.get(p)){
					found=true;
					break;
				}else if(ele>list1.get(p)){
					low=p+1;
				}else{
					high=p-1;
				}
			}
		}
		
		if(found==false){
			for(int i=low;i<=high;i++){
				if(list1.get(i)==ele){
					found=true;
					break;
				}
			}
		}
		System.out.println(found);
	}

}
