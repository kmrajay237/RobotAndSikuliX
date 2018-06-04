package youTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FaceBookLogin {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Screen screen=new Screen();
		
		Pattern email=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\email.PNG");
		screen.type(email,"kmrajay237@gmail.com");
		Thread.sleep(3000);
		Pattern pass=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\password.PNG");
		screen.type(pass,"Ajay9046933956");
		Thread.sleep(3000);
		/*Pattern Login=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\Login.PNG");
		screen.click(Login);
		Thread.sleep(3000);*/
		driver.close();
	}

}
