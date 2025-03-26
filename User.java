abstract class User implements HasMenu, Serializable{

	String userName; 
	String PIN;

	public boolean login(){
		boolean output = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input username.");
		String userNameResult = input.nextLine();
		
		

		if(userName.equals(userNameResult)){
			
			System.out.println("Please input PIN.");
			String PINResult = input.nextLine();

			if(PIN.equals(PINResult)){
				output = true;
			}else{
				System.out.println("PIN is not correct");
			}
		}else{
			System.out.println("Username is not correct");
		}

	}

	public boolean Login(userName, PIN){

	}

	public void setUserName(String userName){
		this.userName = userName;
	}

    public string getUserName(){
		return this.userName();
	}
    
	public void setPIN(String PIN){
		this.PIN = PIN;
	}

    public string getPIN(){
		return this.PIN();
	}
    	
	public abstract string getReport(){

	}
}	
