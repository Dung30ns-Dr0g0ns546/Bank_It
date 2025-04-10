import java.util.Scanner;
import java.io.Serializable;

abstract class User implements HasMenu, Serializable{

	String userName; 
	String pin;

	public boolean login(){
		boolean output = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input username.");
		String userNameResult = input.nextLine();

		if(userName.equals(userNameResult)){
			
			System.out.println("Please input pin.");
			String pinResult = input.nextLine();

			if(pin.equals(pinResult)){
				output = true;
			}else{
				System.out.println("pin is not correct");
			}
		}else{
			System.out.println("Username is not correct");
		}
		return login();
	}

	public boolean Login(String userName, String pin){
		return true;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

    public String getUserName(){
		return this.userName;
	}
    
	public void setPin(String pin){
		this.pin = pin;
	}

    public String getPin(){
		return this.pin;
	}
    	
	public abstract String getReport();
}	
