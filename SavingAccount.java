import java.util.Scanner;

class SavingsAccount extends CheckingAccount{

    private double interestRate;

	public String menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("0) Exit");
        System.out.println("1) Check balance");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
     
    }   

      public void start(){
        
    }

	public static void main(String[] args){
		new SavingsAccount();
	}

	public void calcInterest(){
		double interest = this.balance * this.interestRate;
        this.balance += interest;
         System.out.println("Interest calculated and added. New balance: " + this.balance);
	}

	public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
	}

	public double getInterestRate(){
        return this.interestRate;
	}
}
