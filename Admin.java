import java.util.*;
import java.io.*;

public class Admin extends User implements HasMenu{



    public String menu(){
        System.out.println("0) Exit This Menus");
        System.out.println("1) Check balance");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");

        System.in.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
    }
}