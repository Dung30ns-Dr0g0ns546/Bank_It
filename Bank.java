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
			if (result.equals("1")){
				if (adminMode = true);
				startAdmin();
			}
		} else if (result.equals("2")){
			loginAsCustomer();
		} else {
			System.out.println("Please enter 0-2")


}
