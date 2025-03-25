class CheckingAccount implements HasMenu{}

double balance(){

    CheckingAccount();

    CheckingAccount(double balance){

    }

    String menu(){
        System.out.println("0) Exit");
        System.out.println("1) Check balance");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");

        System.in.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
      }
        

    public double getBalance(){
        return this.balance;
    }

    string getBalanceString(){
        String result = String.format(
    }

    void start(){

    }

    double getBalance(){

    }

    string getBalanceString(){

    }

    public void setBalance(double balance){
    this.balance = balance;

    public void checkBalance()
    System.out.println("Current balance: " + this.getBalanceString());
    }

    private double getDouble(){
      Scanner input = new Scanner(System.in);
      String sResult = input.nextLine();
      double result = 0d;
      try {
        result = Double.parseDouble(sResult);
      } catch
    }

    public void makeDeposit(){

    }

    public void makeWithdrawal(){

    }    
}
