package youTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTube {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=oIlIVFBBbNw");
		
		Actions action=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']"));
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		System.out.println(x+"  "+y);
		//x=150    y=80
		Screen screen=new Screen();
		
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		Pattern pause=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\pause.PNG");
		screen.click(pause);
		Thread.sleep(3000);
		
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		Pattern play=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\play.PNG");
		screen.click(play);
		Thread.sleep(3000);
		
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		Pattern mute=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\mute.PNG");
		screen.click(mute);
		Thread.sleep(3000);
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		Pattern theatermode=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\theatermode.PNG");
		screen.click(theatermode);
		Thread.sleep(3000);
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		Pattern defaultview=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\defaultview.PNG");
		screen.click(defaultview);
		Thread.sleep(3000);
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		Pattern fullscreen=new Pattern("C:\\Users\\AJ\\Pictures\\Facebook\\fullscreen.PNG");
		screen.click(fullscreen);
		Thread.sleep(3000);
		for (int i = 0; i < 2; i++) {
			action.moveToElement(ele, 200, 200);
			action.moveToElement(ele,160,160);
		}
		
		driver.close();

	}

}
