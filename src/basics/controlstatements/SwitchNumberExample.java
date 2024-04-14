package basics.controlstatements;

public class SwitchNumberExample {
    public static void main(String[] args) {
        int number = 5;
        switch (number){
            case 1:
                System.out.println("1");        //if we didn't use break, All the statements will be printed by input val
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            default:
                System.out.println("invalid");
        }
    }
}
