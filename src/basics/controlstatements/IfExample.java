package basics.controlstatements;

public class IfExample {
    public static void main(String[] args) {
        int firstStudentPercentage = 92;
        int secondStudentPercentage = 80;
        if(firstStudentPercentage <= 100){
            System.out.println("A - Grade");
        }
        if ((firstStudentPercentage<100)&&(secondStudentPercentage>70)) {
            System.out.println("Implements Logical AND");
        }
        if ((firstStudentPercentage>100) || (secondStudentPercentage<100)) {
            System.out.println("Implements Logical OR");
        }
        else{
            System.out.println("Implemented Successfully!");
        }

    }
}
