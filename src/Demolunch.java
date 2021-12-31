import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolunch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");

		WebDriver driver = (WebDriver) new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com/search?q=bjpmaharstra&rlz=1C1JJTC_enIN959IN959&oq=bjpmaharstra&aqs=chrome..69i57.4157j0j15&sourceid=chrome&ie=UTF-8");
         
	    driver.quit();
		
	}
	
	
}
