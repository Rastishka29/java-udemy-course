package rastishka.com;

import java.awt.geom.Arc2D;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(){
        this("00000", 00.00, "Default name", "Default email",
                "Default phone number");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail,
                       String customerPhoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("00001", 00.01, customerName, customerEmail, customerPhoneNumber);
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public void depositFunds(double funds){
        if(funds < 0){
            System.out.println(funds + " is a negative value. Funds not deposited.");
            this.balance += 0;
        } else{
            this.balance += funds;
            System.out.println("Deposit amount " + funds + " made. New balance is " + this.balance);
        }
    }

    public void withdrawFunds(double funds){
        if(funds > this.balance){
            System.out.println("Insufficient funds. Only " + this.balance + " available.");
        } else {
            this.balance -= funds;
            System.out.println("Withdrawal amount " + funds + " . Available balance " + this.balance);
        }
    }
}
