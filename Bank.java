import java.util.*;
import java.io.*;

public class Bank implements HasMenu {
	Admin admin = new Admin();
	Customerlist customers = new CustomerList();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		new Bank();
	}

	public Bank(){
		//this.loadSampleCustomers();
		//this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();

	}

	public void start(){
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} elseif (result.equals("1")){
				if (adminMode = true);
				startAdmin();
			} else if (result.equals("2")){
			loginAsCustomer();
		} else {
			System.out.println("Please enter 0-2")
			}
		}
	}

	public void startAdmin(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = admin.menu();
			if (response.equal("0")){
				keepGoing = false;
			} elseif(response.equal("1")){
				System.out.println("Report all users");
				this.reportAllUsers();
			} else if (response.equals("2")){
				
			}
		}
	}

}