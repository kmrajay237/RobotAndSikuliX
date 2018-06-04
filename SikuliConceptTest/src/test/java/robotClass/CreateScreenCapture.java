package robotClass;

import java.awt.AWTException;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateScreenCapture {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.co.in/");
		Robot robot=new Robot();
		/*Rectangle rect=new Rectangle(0, 0,200,200);
		BufferedImage img = robot.createScreenCapture(rect);
		Graphics2D grp = img.createGraphics();
		Object p = grp.setPaintMode();*/
		robot.delay(4000);
		driver.close();
	}

}
