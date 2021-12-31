import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetNaukri {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./SOFTWARE/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		driver.manage().window().maximize();
		
		 
		Set<String> wins=driver.getWindowHandles();		
		
		String parentWH=driver.getWindowHandle();
		
		
		System.out.println(parentWH);
		
		for(String hand:wins)
		{
			System.out.println(hand);
		
			driver.switchTo().window(parentWH);
			driver.close();
			
			
		}
		
		

	}

}
