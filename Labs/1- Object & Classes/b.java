public class Bank {
    String name;
    int id;
    private double bal;
    Bank(String n, int i, double b){
        name=n;
        id=i;
        bal=b;
    }
    void deposit(double amount){
        bal+=amount;
    }
    void withdrawl(double amount){
        bal-=amount;
    }
    
}

public static void main(String[] args) {
    
}