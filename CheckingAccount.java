import java.util.Scanner;

public class CheckingAccount implements HasMenu{


    public String menu(){
        System.out.println("0) Exit");
        System.out.println("1) Check balance");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");

        System.in.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
     
    }   

      public void start(){
        
    }

    public double getBalance(){
        return this.balance();
    }

    public String getBalanceString(){
        String result = String.format();
    }

    

    public void setBalance(double balance){
    this.balance = balance;
    }

    public void checkBalance(){
    System.out.println("Current balance: " + this.getBalanceString());
    }

    public void makeDeposit(){

    }

    public void makeWithdrawal(){

    }    

}
