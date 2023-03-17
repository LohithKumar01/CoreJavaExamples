package loops;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int counter=1;counter<=5;counter++){
            System.out.println(counter); //Counter from 1 to 5.
        }
//        System.out.println("10000.00 interestrate is "+calculateInterest(10000.0,2.5));
        for (double rate=7.5; rate<=10; rate+=0.25){
            double interestAmount= calculateInterest(10000.0,rate);
            System.out.println("The Calculated Rate of Interest of "+ rate + " is " + interestAmount); // Adds interest rate by 0.25 percent
        }
    }
    public static double calculateInterest(double amount,double interestRate){

        return(amount * (interestRate/100));
    }
}
