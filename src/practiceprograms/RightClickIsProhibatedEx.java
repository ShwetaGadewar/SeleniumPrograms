package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickIsProhibatedEx {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	    driver.manage().window().maximize();
	    WebElement login_button=driver.findElement(By.className("login_button"));
	    login_button.click();
	    WebElement un=driver.findElement(By.id("username"));
	    un.sendKeys("shweta");
	    WebElement password=driver.findElement(By.name("password"));
	    password.sendKeys("gadewar");
	    WebElement captchvalue=driver.findElement(By.name("loginCaptchaValue"));
	    captchvalue.sendKeys("sdfgh");
	    
	    

	}

}
