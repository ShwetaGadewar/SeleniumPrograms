package practiceprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HoverOverAmazonSignIn {


	public static void main(String[] args) throws InterruptedException   {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement accountandlist=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions s1=new Actions(driver);
		s1.moveToElement(accountandlist).perform();
	
		Thread.sleep(4000);
		WebElement signin=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		signin.click();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Shweta@gmail.com");
		WebElement continue_button = driver.findElement(By.id("continue"));
		continue_button.click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Shweta");
		WebElement signinButton = driver.findElement(By.id("signInSubmit"));
		signinButton.click();
		
		driver.close();
	}

}
