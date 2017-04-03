package levelSimple;

import java.util.ArrayList;
import java.util.List;

public class NumberCompliment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		int comp = numberCompliment(x);
		System.out.println(comp);
	}

	private static int numberCompliment(int x) {
		if (x == 0) {
			return 1;
		}
		int comp = 0;
		List<Integer> binary = new ArrayList<Integer>();
		int i = 0;
		while (x >= 1) {
			int r = x % 2;
			binary.add(r);
			x = x / 2;
		}
		for (int j = 0; j < binary.size(); j++) {
			if (binary.get(j) == 0) {
				binary.set(j, 1);
			} else {
				binary.set(j, 0);
			}
		}
		System.out.println(binary);
		for (int j = 0; j < binary.size(); j++) {
			int pow = pow(2, j);
			comp = comp + (binary.get(j) * pow);
		}
		return comp;

	}

	private static int pow(int i, int j) {
		int pow = 1;
		for (int k = 0; k < j; k++) {
			pow = pow * i;
		}
		return pow;
	}
}
