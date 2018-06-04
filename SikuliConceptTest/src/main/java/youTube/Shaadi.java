package youTube;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class Shaadi {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.shaadi.com/");
		Screen screen=new Screen();
		Pattern login=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\shadilogin.PNG");
		screen.click(login);
		Thread.sleep(3000);
		Pattern email=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\shadiemail.PNG");
		screen.type(email,"kmrajay237@gmail.com");
		Thread.sleep(3000);
		Pattern pass=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\shadipass.PNG");
		screen.type(pass,"Ajay9046933956");
		Thread.sleep(3000);
		Pattern signin=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\shadisignin.PNG");
		screen.click(signin);
		Thread.sleep(13000);
		driver.close();
	}

}
