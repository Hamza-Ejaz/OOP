/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bankcustomer;
import java.util.*;

/**
 *
 * @author tuser
 */

class MyCustomer{
public String customerName;
public int customerID;
private double customerBalance;

MyCustomer(String cName, int id, double initialBalance){
     customerName = cName;
     customerID = id;
     customerBalance = initialBalance;
}
public double deposit(double customerEnteredValue){
    
    customerBalance = customerBalance + customerEnteredValue;
    return  customerBalance;
}
public void widthdraw(double customerWidthdrawAmount){
    
    if (customerWidthdrawAmount <= customerBalance) {
        customerBalance = customerBalance - customerWidthdrawAmount;
    }
    else{
        System.out.println("You have sufficient balance");
    }
}
public double balanceInquiry(){
    return customerBalance;
}


}
public class BankCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name = input.next();
        System.out.print("Please enter the id : ");
        int id = input.nextInt();
        System.out.print("Enter your initial balance: ");
        double initBal = input.nextDouble();
        MyCustomer customerOne= new MyCustomer(name,id,initBal);
        //Boolean question = true;
        String yesNo;
        //input.close();
      
        do {            
            System.out.print("You have three Options \n 1 for Deposit \n 2 for Widthdraw \n 3 for Balance Inquiry \n"); 
            int options = input.nextInt();
            switch(options){
                case 1:
                    System.out.print("Enter the amount: ");
                    double depostAmount = input.nextDouble();
                    customerOne.deposit(depostAmount);
                    break;
                case 2:
                    System.out.print("Enter Widthdraw amount: ");
                    double widthdrawAmount = input.nextDouble();
                    customerOne.widthdraw(widthdrawAmount);
                    break;
                case 3:
                     double a = customerOne.balanceInquiry();
                     System.out.println(a);
                     break;
            }
            System.out.println("Do you want to continue: ");
            yesNo = input.next();
            
            
        } while (yesNo == "y");
        
 //        System.out.println(object1);
      

    }
    
}
