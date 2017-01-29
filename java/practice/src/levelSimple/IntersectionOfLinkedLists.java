package levelSimple;

//1.Write a program to find the node at which the intersection of two singly linked lists begins.
//2.write a function to compute their intersection.
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IntersectionOfLinkedLists {

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

		Collections.sort(list1);
		Collections.sort(list2);
		Set<Integer> intersection = new HashSet<Integer>();
		int i = 0, j = 0;
		int count = 0;
		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i) < list2.get(j))
				i++;
			else if (list1.get(i) > list2.get(j))
				j++;
			else {
				count++;
				if (count == 1) {
					System.out
							.println("Intersection begins at " + list1.get(i));
				}
				intersection.add(list1.get(i));
				i++;
				j++;
			}
		}
		System.out.println(intersection);
	}

}
