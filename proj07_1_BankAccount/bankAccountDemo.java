package project.proj07_1_BankAccount;

public class bankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount =new BankAccount("Vishal",6000);
        BankAccount SaurabhAccount =new BankAccount("Saurabh");
        SaurabhAccount.deposit(1000);

        System.out.println("Owner : "+SaurabhAccount.getOwner());
        System.out.println("Balance : "+SaurabhAccount.getBalance());

        SaurabhAccount.withdraw(2000);// WARNING!!!

        System.out.println("Owner : "+SaurabhAccount.getOwner());
        System.out.println("Balance : "+SaurabhAccount.getBalance());
        System.out.println();

        System.out.println("Owner : "+myAccount.getOwner());
        System.out.println("Balance : "+myAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000 ? ");
        myAccount.deposit(1000);
        System.out.println("Owner : "+myAccount.getOwner());
        System.out.println("Balance : "+myAccount.getBalance());


    }
}
