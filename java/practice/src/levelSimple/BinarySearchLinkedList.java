package levelSimple;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchLinkedList {

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
		list1.add(10);
		
		int ele=8;
		int low=0,high = list1.size()-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(ele == list1.get(mid)){
				System.out.println("element found at "+mid);
				break;
			}else if(ele<list1.get(mid)){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
	}

}
