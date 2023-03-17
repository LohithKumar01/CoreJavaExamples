package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray=getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("--------------------");
        int[] array={99,8,4,55,36,47,76};
        int length=array.length;
        System.out.println(length);
        String[] myarray={"K","U","O","A","Z","a","z"};
        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(myarray));
    }

    public static int[] getRandomArray(int len){
        Random random=new Random();
        int[] randomArray=new int[len];

        for(int i=0;i<len;i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

}
