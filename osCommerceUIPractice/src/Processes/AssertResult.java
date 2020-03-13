package Processes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertResult {

	WebDriver driver;
	
    public AssertResult(WebDriver driver){
        this.driver = driver;
    }
    
	public void assertResult(String result) {
		Screens.ResultPage assertResult = new Screens.ResultPage(driver);
		assertResult.assertResult(result);	
	}
}
