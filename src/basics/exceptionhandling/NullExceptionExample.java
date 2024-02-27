package basics.exceptionhandling;

public class NullExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = null;
            System.out.println(numbers[3]);
        } catch (NullPointerException e) {
            System.out.println("The array is null.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds. Please try again");
        }
    }
}
