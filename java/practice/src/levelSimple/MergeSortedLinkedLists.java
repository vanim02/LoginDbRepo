package levelSimple;

import java.util.LinkedList;
import java.util.List;

public class MergeSortedLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);

		list2.add(2);
		list2.add(3);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		int i = 0, j = 0;
		while (i < list1.size() && j < list2.size()) {
			if (!(list1.get(i) < list2.get(j))) {
				list1.add(i, list2.get(j));
				i++;
				j++;
			} else {
				i++;
			}
		}
		System.out.println(list1);

	}

}
