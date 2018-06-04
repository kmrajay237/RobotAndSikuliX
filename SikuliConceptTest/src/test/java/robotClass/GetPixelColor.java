package robotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetPixelColor {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.co.in/");
		Robot robot=new Robot();
		String color = robot.getPixelColor(500, 500).toString();
		System.out.println(color);
		robot.delay(4000);
		driver.close();
	}

}
