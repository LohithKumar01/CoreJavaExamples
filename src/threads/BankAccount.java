package threads;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        double origbalance = balance;
        balance+=amount;
        System.out.println("Starting balance " + origbalance + " Amount " + amount +" Total Balance" + balance);
    }

    public void withdraw(double amount){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        double origbalance = balance;
        if (amount<=balance){
            balance-=amount;
            System.out.println("Starting balance " + origbalance + " Amount " + amount +" Total Balance" + balance);
        }
    }
}
