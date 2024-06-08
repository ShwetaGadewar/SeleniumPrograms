package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamWithAbsolute {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Shweta%20Prasad/Documents/learningHTML1.html");
    	driver.manage().window().maximize();
    	
    	WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]")); 
    	un.sendKeys("Shweta");
    	
    	WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
    	hint.sendKeys("My name is");
    	
    	WebElement password=driver.findElement(By.xpath("(/html/body/input)[3]"));
    	password.sendKeys("Shweta123");
    	
    	WebElement fn=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
    	fn.sendKeys("Shweta");
    	
    	WebElement boy=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
    	boy.click();
    	
    	WebElement girl=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
    	girl.click();
    	
    	WebElement baby=driver.findElement(By.xpath("(/html/body/form/input)[6]"));
    	baby.click();
    	
    	WebElement male=driver.findElement(By.xpath("(/html/body/input)[4]"));
    	male.click();
    	
    	WebElement female=driver.findElement(By.xpath("(/html/body/input)[5]"));
    	female.click();
    	
    	WebElement relocate=driver.findElement(By.xpath("(/html/body/input)[6]"));
    	relocate.click();
    	
    	WebElement sign_Button=driver.findElement(By.xpath("(/html/body/input)[7]"));
    	sign_Button.click();
	}

}
