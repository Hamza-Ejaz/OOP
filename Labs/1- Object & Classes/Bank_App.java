/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bank_app;

/**
 *
 * @author tuser
 */
class BankAccount{
    public String  Customer_Name;
    private String Account_Number;
    private int Balance = 0;

    public BankAccount(String Account_Number, String Customer_Name) {
        this.Customer_Name = Customer_Name;
        this.Account_Number = Account_Number;
    }

    public String getName() {
        return Customer_Name;
    }

    public void setName(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public int getBalance() {
        return Balance;
    }
    
    public int withdrawal(int Amount){
    Balance -= Amount;
    return Balance;
    }
    public int deposit(int Amount){
        Balance += Amount;
        return Balance;
    }
    
    
}
public class Bank_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount user1 = new BankAccount("005467","Kashif Saleem");
        BankAccount user2 = new BankAccount("005456","Huzaifa Jamal");
        BankAccount user3 = new BankAccount("005488","Huraira Bugti");
        BankAccount user4 = new BankAccount("005498","Shah Salman");
        
        user1.deposit(5000);
        user2.deposit(10000);
        user3.deposit(21000);
        user4.deposit(56000);
        user1.deposit(8000);
        
        System.out.println("User 2 Details: ");
        System.out.println(user2.getName());
        System.out.println(user2.getBalance());
        System.out.println(user2.getAccount_Number());
    }
    
}
