import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseoverdemo {

	public static void main(String[] args) throws InterruptedException {
System.out.println("Learning all locators in selenium ");
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
         driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		
		WebElement Link_home = driver.findElement(By.linkText("Home"));
		WebElement td_home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		Action mouseover = action.moveToElement(Link_home).build();
		

		Thread.sleep(2000);
		
		mouseover.perform();
		
		
		
		//String bgColor =td_home.getCssValue("BACKGROUND");
		
	//System.out.println("Before hover:" + bgColor);
	
	//mouseover.perform();
	
	//Thread.sleep(2000);
	
	//bgColor = td_home.getCssValue("BACKGROUND");
	
	//System.out.println("After hover:" + bgColor);
	
	
		
	
		
		
		
		
		
		
		
		

	}

}
