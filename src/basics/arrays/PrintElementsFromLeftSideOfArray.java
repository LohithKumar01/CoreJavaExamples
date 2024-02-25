package basics.arrays;

import java.util.Arrays;

public class PrintElementsFromLeftSideOfArray {
    public static void main(String[] args) {
        int[] inputArray = {5, 6, 7, 8, 9};
        int[] newArray = new int[5];
        int index = 1;
        int i=0;
        while (i < inputArray.length) {
            newArray[i] = inputArray[(index + i) % inputArray.length];
            i++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
