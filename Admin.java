import java.util.*;
import java.io.*;

public class Admin extends User implements HasMenu , Serializable{

    public String menu(){
		Scanner input = new Scanner(System.in);

        System.out.println("0) Exit This Menus");
        System.out.println("1) Full Customer Report");
        System.out.println("2) Add User");
        System.out.println("3) Apply Interest To Savings Accounts");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
    }

    public void start(){
        
    }

    public String getReport(){
        System.out.println(getUserName());
		System.out.println(CheckingString());
		System.out.println(SavingsString());
    }
}