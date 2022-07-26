package ActionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {
	
WebDriver driver;
	
public LoginPage(WebDriver driver) {
	this.driver=driver;
	
}
public LoginPage OpenURL() {
	return this;
}

}
