package levelSimple;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomSearchLinkedList {

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
		
		int low=0, high=list1.size()-1, p, ele=1;
		Random r=new Random();
		while(low<=high){
			p=r.nextInt(high-low+1)+low;
			System.out.println(p);
			if(ele==list1.get(p)){
				System.out.println("found");
				break;
			}else if(ele<list1.get(p)){
				high=p-1;
			}else{
				low=p+1;
			}
		}
	}

}
