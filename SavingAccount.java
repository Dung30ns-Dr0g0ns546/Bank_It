class SavingsAccount extends CheckingAccount{

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
    }
	
	public double interestRate(){

	}

	public static void main(String[] args){
		new SavingsAccount();
	}

	public calcInterest(){
		
	}

	public void setInterestRate(){

	}

	public double getInterestRate(){

	}
}
