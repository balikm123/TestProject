import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./SOFTWARE/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hirect.com");
		
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
		
		driver.navigate().back();
		
		Thread.sleep(20000);
		
		System.out.println("================================================");
		
		String tittle = driver.getTitle();
		
		System.out.println(tittle);
		
		
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.close();
		
		
		
		
		

	}

}
