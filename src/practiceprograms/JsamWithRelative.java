package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsamWithRelative {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Shweta%20Prasad/Documents/learningHTML1.html");
		 driver.switchTo().alert().accept();
	     driver.manage().window().maximize();
	     
	     WebElement un=driver.findElement(By.xpath("//input[@id='1']"));
	     un.sendKeys("Shweta");
	     
	     WebElement hint=driver.findElement(By.xpath("//input[@id='2']"));
         hint.sendKeys("my name is");
         
         WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
         password.sendKeys("Shweta123");
         
         WebElement fn=driver.findElement(By.xpath("//input[@name='fname']"));
     	fn.sendKeys("Shweta");
     	
     	WebElement boy=driver.findElement(By.xpath("//input[@id='123']"));
     	boy.click();
     	
     	WebElement girl=driver.findElement(By.xpath("//input[@name='name2']"));
     	girl.click();
     	
     	WebElement baby=driver.findElement(By.xpath("//input[@name='name3']"));
     	baby.click();
     	
     	WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
     	male.click();
     	
     	WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
     	female.click();
     	
     	WebElement relocate=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
     	relocate.click();
     	
     	WebElement sign_Button=driver.findElement(By.xpath("//input[@value='Sign up']"));
     	sign_Button.click();
         
	}

}
