package Libraryinfor;

public class LoginService {
	String idea;
	String password;
	
	boolean login(String id, String password) {
		if(id =="" && password == "") {
			return true;
		}else {
			return false;
		}
		
	}
	public LoginService() {
		
	}

}
