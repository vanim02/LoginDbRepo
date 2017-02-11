package levelSimple;

import java.util.Scanner;

public class InputArrayDoubliSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 5;
		String[] list1 = new String[size];
		Scanner s = new Scanner(System.in);
		String input = "";
		int cnt = 0;
		do {
			System.out.println("Enter the strings");
			input = s.nextLine();
			if (!input.equalsIgnoreCase("end")) {
				if (!input.equals("")) {
					if (cnt < size)
						list1[cnt++] = input;
					else {
						String[] list2=new String[2*size];
						for(int i=0;i<cnt;i++){
							list2[i]=list1[i];
						}
						size=2*size;
						list2[cnt++]=input;
						list1=list2;
					}
				}
			} else {
				break;
			}
		} while (true);
	}

}
