import java.util.*;
import java.io.*;

public class Baml implements HasMenu {
	Admin admin = new Admin();
	Customerlist customers = new CustomerList();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		new Bank();
	}

	public Bank(){
		this.loadCustomers();
		this.start();
		this.saveCustomers();
	}
}