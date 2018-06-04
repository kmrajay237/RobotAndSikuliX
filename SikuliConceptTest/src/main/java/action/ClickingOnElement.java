package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickingOnElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.website.com/");
		WebElement getstarted = driver.findElement(By.xpath("//span[text()='Get Started']"));
		action.click(getstarted).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
