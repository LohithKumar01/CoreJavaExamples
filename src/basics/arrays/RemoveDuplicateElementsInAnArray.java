package basics.arrays;

import java.util.Arrays;

public class RemoveDuplicateElementsInAnArray {
    public static void main(String[] args) {
        int[] uniqueArray = new int[5];
        int[] inputArray = {1,1,2,3,4};
        int index=0;
        for (int i=0; i<= inputArray.length-1; i++){
            boolean isExist = isArrayContainsElement(uniqueArray,inputArray[i]);
            if (!isExist){
                uniqueArray[index]=inputArray[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(uniqueArray));
    }
    public static boolean isArrayContainsElement(int[] checkArray, int value){
        for (int i=0;i<=checkArray.length-1; i++){
            if (checkArray[i] == value){
                return true;
            }
        }
        return false;
    }
}
