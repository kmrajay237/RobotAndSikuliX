package chromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		//DesiredCapabilities cap=new DesiredCapabilities();
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-infobars");
		//co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.close();

	}

}
