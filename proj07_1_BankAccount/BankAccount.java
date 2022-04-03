package project.proj07_1_BankAccount;

public class BankAccount {
    private String owner ;
    private int balance;
    public BankAccount(String owner){
        this(owner,0);
    }
    public BankAccount(String owner,int balance){
        this.balance=balance;
        this.owner=owner;
    }
    void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Amount to deposit must be greater than 0");
        }
    }
    void withdraw(int amount){
        if(amount >0 && balance>=amount){
            balance-=amount;
        }else{
            System.out.println("the amount to be withdrawn should be greater than 0 and less than your balance");
        }
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}