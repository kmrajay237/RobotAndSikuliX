package youTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AJ/Desktop/fileupload.html");
		driver.findElement(By.id("a1")).click();
		Thread.sleep(3000);
		Screen screen=new Screen();
		Pattern filename=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\filename.PNG");
		screen.type(filename,"C:\\Users\\AJ\\Desktop\\Kumar Ajay.doc");
		Thread.sleep(3000);
		Pattern open=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\open.PNG");
		screen.click(open);
		Thread.sleep(3000);
		driver.close();
	}

}
