Customer.class: Customer.java User.class CheckingAccount.class SavingAccount.class
	javac -g Customer.java

User.class: User.java HasMenu.class
	javac -g User.java

CheckingAccount.class: CheckingAccount.java HasMenu.class
	javac -g CheckingAccount.java

SavingAccount.class: SavingAccount.java CheckingAccount.class
	javac -g SavingAccount.java

HasMenu.class: HasMenu.java
	javac -g HasMenu.java

testAdmin: Admin.class
	java Admin

testCustomer: Customer.class
	java Customer

testChecking: CheckingAccount.class
	java CheckingAccount

testSavings: SavingAccount.class
	java SavingAccount

clean:
	rm *.class
