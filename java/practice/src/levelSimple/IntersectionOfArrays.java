package levelSimple;

public class IntersectionOfArrays {
    // given an int array and an element, print whether it exists or not
    public static void printDuplicate(int[] num, int elem) {
        boolean exists = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == elem) {
                exists = true;
                //System.out.println("element exists");
                break;
            }
        }
        if (!exists) {
            addIfNotExists(num, elem);
           // System.out.println("element does not exists");
        }
    }

    // given an array, element: add elem to array if not exists. print final
    // array
    public static void addIfNotExists(int[] num, int elem) {
        int[] finalArray = new int[num.length + 1];
        for (int i = 0; i < num.length; i++) {
            finalArray[i] = num[i];
        }
        finalArray[num.length] = elem;
        for (int i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }

    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };
        printDuplicate(num, 2);
    }

}