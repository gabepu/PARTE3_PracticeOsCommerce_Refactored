package Screens;

import org.openqa.selenium.WebDriver;

public class ResultPage {

	WebDriver driver;
	
    public ResultPage(WebDriver driver){
        this.driver = driver;
    }
	
	public void assertResult(String result) {
		Processes.AssertResultProcess assertResult = new Processes.AssertResultProcess(driver);
		assertResult.assertResult(result);	
	}
}
