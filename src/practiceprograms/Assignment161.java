package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment161 {

	public static void main(String[] args) {
		
				
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
				
				WebElement login=driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
				login.click();
				
				
				
				WebElement un=driver.findElement(By.id("username"));
				un.sendKeys("Shweta");
				
				WebElement password=driver.findElement(By.id("label2"));
				password.sendKeys("Gadewar");
				
				WebElement loginCaptchaValue=driver.findElement(By.id("loginCaptchaValue"));
				loginCaptchaValue.sendKeys("dgfhjb");
				
				WebElement login2=driver.findElement(By.id("Button2"));
				login2.click();
					
				
	
	}

}
