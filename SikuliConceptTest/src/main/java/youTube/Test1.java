package youTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.co.in/");
		Screen screen=new Screen();
		
		Pattern gmail=new Pattern("C:\\images\\gmail.PNG");
		screen.click(gmail);
		Thread.sleep(4000);
		
		Pattern emailorphone=new Pattern("C:\\images\\emailorphone.PNG");
		screen.type(emailorphone,"lochiajay");
		Thread.sleep(4000);
		
		Pattern next=new Pattern("C:\\images\\next.PNG");
		screen.click(next);
		Thread.sleep(4000);
		
		Pattern password1=new Pattern("C:\\images\\password.PNG");
		screen.type(password1,"Ajay9046933956");
		Thread.sleep(4000);
		
		//Pattern next=new Pattern("C:\\images\\signin.PNG");
		screen.click(next);
		Thread.sleep(4000);
		
		driver.close();
	}

}
