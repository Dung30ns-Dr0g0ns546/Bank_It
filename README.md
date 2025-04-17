# Bank_It

# Algorithm for Bank It

# Admin
public class Admin extends User implements HasMenu , Serializable
Create a menu class
Have the class give the user four options: Exit the menu, start a full customer report, add a user, or apply interest to a savings account
Print the result and have the user choose from the four options
Print a result of the admin's username and pin number

# Bank
public class Bank implements HasMenu
Set Admin class as "admin"
Create an ArrayList and name it "Customers"
Create a constructor class called "Bank"
Create a class called "saveCustomers" and have it save customers into the arraylist
Create a class called "loadCustomers" and have it load customers from the arraylist
Create a class called "fullCustomerReport" and have it make a full report on all customers - including their name, checking account balance and savings account balance
Create a class called "addUser" and have it make customers
Create a class called "applyInterest" and have it apply interest to a customer's savings account
Create a menu class
Have the class give the user three options: exit the menu, login as a customer, or login as the user
Create a class called "loginAsCustomer" and have the user be able to use a username and pin number to login as a customer
Create a class called "currentCustomer" and have it make the user a customer once they have put in the username
Create a class called "start" and have it run keepGoing as true
While keepGoing is true, do one of the following: make keepGoing false if "0," login as Admin if "1," or login as Customer if "2"
Create a class called "loginAsAdmin" and have it run keepGoing as true
While keepGoing is true, do one of the following: make keepGoing false if "0," write a full customer report if "1," add a user if "2," and apply interest to a user's savings account if "3"


# CheckingAccount
public class CheckingAccount implements HasMenu
Create a menu class
Have the class give the user four options: Exit the menu, check the balance of the account, make a deposit, or make a withdrawal
Create a class called "start" and have it run keepGoing as true
While keepGoing is true, do one of the following: make keepGoing false if "0," get the balance of the account if "1," make a deposit if "2," and make a withdrawal if "3"
Create a class called "getBalance" and have it return getBalance()
Create a class called "getBalanceString" and have it format the following sentence: "$%f, checking"
Create a class called "setBalance" and have it set the balance as a variable
Create a class called "checkBalance" and have it print out "Current balance:  + this.getBalanceString()"
Create a class called "makeDeposit" and have it use a scanner
Have the "makeDeposit" class print two lines - "Making a deposit..." and "How much do you want to deposit?: ," then use the scanner to figure out how much the user wants to deposit
Create a class called "makeWithdrawal" and have it use a scanner
Have the "makeWithdrawal" class print two lines - "Making a withdrawal..." and "How much do you want to withdrawal?: ," then use the scanner to figure out how much the user wants to withdraw


# Customer
class Customer extends User
Create two constructor class called "Customer", and have it use the variables "userName" and "pin"



# HasMenu



# SavingAccount



# User
