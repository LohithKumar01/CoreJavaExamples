package basics.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers[0]);
//        for (int i = 0; i <= (numbers.length - 1); i++){
//            System.out.print(numbers[i] + " ");
//        }
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));        //if .tostring is not included it shows hash value

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));        //prints sorted array.

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));       //it's an empty array. so default value is 0.

        Arrays.fill(secondArray,8);
        System.out.println(Arrays.toString(secondArray));       //fills the entire array with value 8.

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));        //prints a new random array.

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));       //Copies thirdArray.

        int[] smallArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallArray));        //prints until the length 5

        int[] largerArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));       //prints upto length of thirdArray and then prints zero.

        int[] sizeArray1 = {5, 4, 3, 2, 1};
        int[] sizeArray2 = {5, 4, 3, 2, 1};
        if (Arrays.equals(sizeArray1,sizeArray2)){
            System.out.println("Both Arrays are Equal.");
        }
        else {
            System.out.println("Arrays are not equal.");
        }

        String[] nameArray = {"Leo" , "Tim", "Mark", "Kim", "Bruce"};
        System.out.println(Arrays.toString(nameArray));
        Arrays.sort(nameArray);
        System.out.println(Arrays.toString(nameArray));
        if (Arrays.binarySearch(nameArray,"Leo")>=0){
            System.out.println("Found.");
        }
        else {
            System.out.println("Not Found.");
        }
    }

    private static int[] getRandomArray(int length){
        Random random=new Random();
        int[] newInteger = new int[length];
        for (int i=0;i<length;i++){
            newInteger[i] = random.nextInt(100);
        }
        return newInteger;
    }
}
