package processes;

import org.openqa.selenium.WebDriver;

public class AssertResult {

	WebDriver driver;
	
    public AssertResult(WebDriver driver){
        this.driver = driver;
    }
    
	public void assertResult(String result) {
		screens.ResultPage assertResult = new screens.ResultPage(driver);
		assertResult.assertResult(result);	
	}
}
