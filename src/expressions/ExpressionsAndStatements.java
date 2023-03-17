package expressions;

public class ExpressionsAndStatements {
    public static void main(String[] args) {
        System.out.println("Hello, Lohith");
        System.out.println("Lets discuss about the marks");

        int TopScore=80;    //If task
        if(TopScore < 100){
            System.out.println("It is the first class.");
        }

        int secondTopScore=75;  //Logical AND operator task
        if (secondTopScore<TopScore && secondTopScore>70){
            System.out.println("It is the second class.");
        }

        if((TopScore>80) || (secondTopScore<80)){   //Logical OR operator task
            System.out.println("Either one of this is true");
        }

        int newValue=50;    //Assignment operator VS Equals to
        if (newValue==50){
            System.out.println("This is True");
        }

        boolean isChar=true;
        if (isChar !=false){
            System.out.println("Boolean can be seen");
        }

        int childAge=20;    //Terenary Operator
        String s = childAge >= 18 ? "He is a kid" : "He is an adult";
        System.out.println(s);

        //Challenge
        double myFirstNumber=20.00d;
        double mySecondNumber=80.00d;
        double mySum= (myFirstNumber+mySecondNumber)*100.00d;
        System.out.println(mySum);
        double myRemainder=mySum % 40.00d;
        System.out.println("Remainder is "+myRemainder);
        boolean myBoolRemainder=(myRemainder==0)?Boolean.FALSE:Boolean.FALSE;
        System.out.println(myBoolRemainder);
        if (!myBoolRemainder){
            System.out.println("Got some remainder.");
        }


    }
}
