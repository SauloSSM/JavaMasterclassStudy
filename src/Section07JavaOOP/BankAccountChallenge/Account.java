package Section07JavaOOP.BankAccountChallenge;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("56739", 2.50, "Default Name",
                "Default Address", "Default Phone");
        System.out.println("Creating Account...");
    }

    public Account(String accountNumber, double balance, String customerName,
                   String customerEmail, String customerPhone) {
        System.out.println("Account with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposited of $" + depositAmount +
                " has been successful! " + "New Balance: $"  + this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {

        if (balance -  withdrawAmount < 0) {
            System.out.println("Insufficient Funds!! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " has been successful!" +
                    " Remaining balance: " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}