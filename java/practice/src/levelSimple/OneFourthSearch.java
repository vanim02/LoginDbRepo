package levelSimple;

public class OneFourthSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 4, 5, 6, 7, 9, 12 };
		int ele = 1;
		int low = 0, high = a.length - 1;
		int p = 0;
		int inc = 0;
		boolean found = false;
		while (low <= high) {
			System.out.println("low=" + low + " high=" + high);
			inc = (high - low) / 4;
			if (inc == 0) {
				break;
			} else {
				p = p + inc;
				System.out.println("p= " + p);
				if (ele == a[p]) {
					found = true;
					System.out.println("found");
					break;
				} else if (ele < a[p]) {
					high = p - 1;
				} else {
					low = p + 1;
				}
			}
		}
		if (low <= high && found == false) {
			for (int i = low; i <= high; i++) {
				if (a[i] == ele) {
					found = true;
					break;
				}
			}
		}
		System.out.println(found);		
	}

}
