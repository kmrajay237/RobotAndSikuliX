package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.website.com/");
		//action.keyDown(Keys.SHIFT+""+Keys.ARROW_DOWN).perform();
	}

}
