import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNaukri {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./SOFTWARE/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.naukri.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Set<String> win=driver.getWindowHandles();
	
		
		
		for (String  hand: win) {
			
			
			driver.switchTo().window(hand);
			Thread.sleep(2000);
			driver.close();
			
			
		}
		
	}

}
