import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./SOfTWARE/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println("=======================================================");
		System.out.print("Tittle for site :");System.out.println(title);
		
		String url=driver.getCurrentUrl();
		
		System.out.print("Current Url :");System.out.println(url);
		
		driver.close();

	}

	
	}


