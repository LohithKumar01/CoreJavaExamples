package control;

public class SwitchExample {
    public static void main(String[] args) {
        int switchValue=5;
//        String switchValue="ton";
        switch (switchValue){
            case 1:
                System.out.println("Shows 1");
                break;
            case 2:
                System.out.println("Shows 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Shows the all 3 values.");
                break;
            default:
                System.out.println("Value not mentioned.");
                break;
        }

    }
}
