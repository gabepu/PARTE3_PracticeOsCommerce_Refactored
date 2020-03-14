package processes;

import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;
	
    public Logout(WebDriver driver){
        this.driver = driver;
    }
    
    public void logout() {
		screens.LogoutPage logout = new screens.LogoutPage(driver);
    	logout.logout();
    }
  
}
