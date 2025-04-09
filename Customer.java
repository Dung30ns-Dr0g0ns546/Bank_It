class Customer extends User{
	
	CheckingAccount checking;
	SavingsAccount savings;

	public void main(){

	}

	public boolean Customer(){

	}

	public boolean Customer(usernName, PIN){

	}

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){

			} else if (result.equals("2")){

			} else if (result.equals("3")){

			} else {
				System.out.println("Please enter 0-3");
			}

	}

	public string menu(){
		System.out.println("0) Exit");
        System.out.println("1) Manage Checking Account");
        System.out.println("2) Manage Saving Account");
		System.out.println("3) Change PIN");

        System.in.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
	}

	public void changePin(){
		System.out.println("Enter New PIN: ");

		String newPin = input.nextLine();
		
		if (newPin.equals(PIN)){
			System.out.println("Incorrect. You have entered your current PIN. Try again.");
		} else {
			System.out.println("New PIN has been set.");
		}
	}

	public string getReport();
}	
