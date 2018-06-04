package robotClass;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MousePress {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.co.in/");
		Actions action=new Actions(driver);
		Robot robot=new Robot();
		Thread.sleep(4000);
		WebElement image = driver.findElement(By.xpath("//a[text()='Gmail']"));
		action.moveToElement(image).perform();
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		Thread.sleep(4000);
		driver.close();

	}

}
