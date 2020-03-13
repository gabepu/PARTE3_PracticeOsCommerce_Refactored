package Screens;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	private static String LOGIN_URL="https://demo.oscommerce.com/login.php";
	private static String LOGOUT_URL="https://demo.oscommerce.com/login.php";
		
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

	public void login(String username, String password) {
		driver.get(LOGIN_URL);
		Processes.LoginProcess login = new Processes.LoginProcess(driver);
		login.login(username, password);
	}
	
	public void logout() {
		driver.get(LOGOUT_URL);
	}

}
