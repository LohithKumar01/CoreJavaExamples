package basics.arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        float[] numberArray = {1, 2, 3, 4, 5};
        float sum = 0;
        float average = 0;
        for (int i=0; i<numberArray.length; i++){
            sum = sum + numberArray[i];
            average = sum / numberArray.length;
        }
        System.out.println(average);
    }
}
