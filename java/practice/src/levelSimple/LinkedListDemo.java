package levelSimple;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list=new  LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(8);
		
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.indexOf(7));
//		System.out.println(list.hashCode());
//		System.out.println(list.iterator());
		list.set(5, 19);
		list.remove(8);
		System.out.println(list);
		
	}

}
