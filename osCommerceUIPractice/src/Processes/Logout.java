package Processes;

import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;
	
    public Logout(WebDriver driver){
        this.driver = driver;
    }
    
    public void logout() {
		Screens.LogoutPage logout = new Screens.LogoutPage(driver);
    	logout.logout();
    }
  
}
