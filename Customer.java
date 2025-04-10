import java.util.Scanner;

class Customer extends User{
	
	CheckingAccount checking = new CheckingAccount();
	SavingsAccount savings = new SavingsAccount();

	public Customer(){
		this.userName = "John Doe";
		this.pin = "1234";
	}

	public Customer(String usernName, String PIN){
		this.userName = userName;
		this.pin = pin;
	}

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				checking = new CheckingAccount();
			} else if (result.equals("2")){
				savings = new SavingsAccount();
			} else if (result.equals("3")){
				changePin();
			} else {
				System.out.println("Please enter 0-3");
			}

		}
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("0) Exit");
        System.out.println("1) Manage Checking Account");
        System.out.println("2) Manage Saving Account");
		System.out.println("3) Change PIN");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
	}

	public void changePin(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New PIN: ");

		String newPin = input.nextLine();
		
		if (newPin.equals(pin)){
			System.out.println("Incorrect. You have entered your current PIN. Try again.");
		} else {
			System.out.println("New PIN has been set.");
		}
	}

	public String getReport(){
		System.out.print(getUserName());
		System.out.print(checking);
		System.out.print(savings);

		return getReport();
	}
}	
