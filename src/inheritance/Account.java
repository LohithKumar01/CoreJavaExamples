package inheritance;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerMobile;

    public void depositFunds(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposit of $"+depositAmount+" made. New balance is $"+balance);
    }
    public void withdrawlFunds(double withdrawlAmount){
        if (balance-withdrawlAmount<0){
            System.out.println("Insufficient Funds! You only have $"+balance+" in your account.");
        }
        else {
            balance-=withdrawlAmount;
            System.out.println("Withdrawl of $"+withdrawlAmount+" processed. You now have $"+balance+" in your account.");
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }
}
