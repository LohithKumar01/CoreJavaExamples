package basics.exceptionhandling;

public class ApplicationException extends RuntimeException{             //CREATING  A CUSTOM EXCEPTION WHICH EXTENDS UNCHECKED EXCEPTION
    private int errorCode;                      //INSTANCE VARIABLES
    private String errorMessage;                //INSTANCE VARIABLE
    ApplicationException(int errorCode, String errorMessage){       //Creating a CONSTRUCTOR
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }
    ApplicationException(){                     //EMPTY CONSTRUCTOR

    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
