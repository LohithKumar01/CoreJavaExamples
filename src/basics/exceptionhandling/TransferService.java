package basics.exceptionhandling;

public class TransferService {          //CREATING A CLASS

    public void transfer(int amount) throws ApplicationException {              //CREATING A METHOD WITH VOID WHICH WILL RETURN NOTHING
        if (amount < 10){
            throw new ApplicationException(111,"Insufficient Amount");
        }
        System.out.println("Transfer Completed!");
    }
    public void transfer2(int amount) {                                 //WITHOUT THROWS. IT DOESN'T CHANGE ANYTHING AS WE ARE TAKING CARE OF THAT IN MAIN CLASS WHICH SHOULD BE TAKEN CARE OF.
        if (amount < 10){
            throw new ApplicationException(111,"Insufficient Amount");
        }
        System.out.println("Transfer Completed!");
    }
}
