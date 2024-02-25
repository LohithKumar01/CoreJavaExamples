package basics.arrays;

import java.util.Arrays;

public class IntersectionOfAnArray {
    public static void main(String[] args) {
        int[] intersectionArray = new int[5];                       // Creating an empty array to insert final values
        int[] firstArray = {1, 2, 3, 7, 8};
        int[] secondArray = {9, 2, 3, 6, 5};
        int index = 0;                                              //taking default index value
        for (int i = 0; i < firstArray.length; i++) {
            if (isElementExistInArray(firstArray, secondArray[i])) {    //comparing 2 arrays with each element in second array
                intersectionArray[index] = secondArray[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(intersectionArray));
    }

    public static boolean isElementExistInArray(int[] checkArray, int value) {      //boolean intersection method.
        for (int i = 0; i < checkArray.length; i++) {
            if (checkArray[i] == value) {
                return true;
            }
        }
        return false;
    }
}
