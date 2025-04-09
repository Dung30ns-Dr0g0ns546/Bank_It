class SavingsAccount extends CheckingAccount{

    private double interestRate;

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

    public string getBalanceString(){
        String result = String.format();
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void checkBalance(){
        System.out.println("Current balance: " + this.getBalanceString());
    }

    public void makeDeposit(){
		System.out.println("Making a deposit...");
        System.out.println("How much do you want to deposit?: ");
        Double depositResult = input.nextDouble();
        this.balance += depositResult;
    }

    public void makeWithdrawal(){
        System.out.println("Making a withdrawal...");
        System.out.println("How much do you want to withdrawal?: ");
        Double withdrawalResult = input.nextDouble();
        this.balance -= withdrawalResult;
    }

	public static void main(String[] args){
		new SavingsAccount();
	}

	public calcInterest(){
		double interest = this.balance * this.interestRate;
        this.balance += interest;
         System.out.println("Interest calculated and added. New balance: " + this.balance);
	}

	public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
	}

	public double getInterestRate(){
        return this.interestRate();
	}
}
