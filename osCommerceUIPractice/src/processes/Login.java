package processes;

import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
		
    public Login(WebDriver driver){
        this.driver = driver;
    }
    
    public void login(String username, String password) {
		screens.LoginPage login = new screens.LoginPage(driver);
    	login.login(username, password);
    }
    
}