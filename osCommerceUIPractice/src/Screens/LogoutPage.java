package Screens;

import org.openqa.selenium.WebDriver;

public class LogoutPage {

	WebDriver driver;
			
    public LogoutPage(WebDriver driver){
        this.driver = driver;
    }

	public void logout() {
		driver.get("https://demo.oscommerce.com/logoff.php");
	}

}
