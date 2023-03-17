package inheritance;

public class Customer {
    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Customer(String customerName, double customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

}
