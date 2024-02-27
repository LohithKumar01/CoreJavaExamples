package basics.exceptionhandling;

public class TransferMain {

    public static void main(String[] args) {
        try{
            TransferService transferService = new TransferService();            //CREATING NEW OBJECT WITH NEW KEYWORD.
            transferService.transfer2(1);                               //USING OBJECT.METHOD NAME TO USE THE METHOD DECLARED IN ANOTHER CLASS.
        }catch (ApplicationException e){
            System.out.println(e.getErrorCode()+ "-" + e.getErrorMessage());       //EXCEPTION WITH ERROR CODE AND MESSAGE CAN BE PRINTED LIKE MENTIONED SERVICE CLASS.
        }
    }
}
