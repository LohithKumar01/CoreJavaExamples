package basics.arrays;

public class LargestAndSmallestInAnArray {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 3, 1, 5, 4};
        int largeTemp = unsortedArray[0];                       //Create a large temp variable
        int smallTemp = unsortedArray[0];                       //Create a small temp variable
        for (int i=0; i<unsortedArray.length-1;i++){
            if (unsortedArray[i+1]>largeTemp){                  //Compare other elements with assigned Large temp variable
                largeTemp=unsortedArray[i+1];
            }
            if (unsortedArray[i+1]<smallTemp){                  //Compare other elements with assigned small temp variable
                smallTemp=unsortedArray[i+1];
            }
        }
        System.out.println("Largest Number is: "+ largeTemp);
        System.out.println("Smallest Number is: "+ smallTemp);
    }
}
