package Processes;

import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
		
    public Login(WebDriver driver){
        this.driver = driver;
    }
    
    public void login(String username, String password) {
		Screens.LoginPage login = new Screens.LoginPage(driver);
    	login.login(username, password);
    }
    
}