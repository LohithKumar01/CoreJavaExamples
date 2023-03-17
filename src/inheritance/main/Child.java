package inheritance.main;

public class Child {

    public static void main(String[] args) {
        Object result = test();
        int value =0;
        String valStr ="";
        if(result instanceof Integer){
            value = (Integer) result;
        }else{
            valStr = (String) result;
        }

        System.out.println("valStr " + valStr);
        System.out.println("val " + value);
    }
    public static Object test(){
        return 88;

    }
}
