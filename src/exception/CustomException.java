package exception;

public class CustomException  extends Exception{

    private String message = "";
     CustomException(String msg){
        message =msg;
    }
}
