package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment167 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement un=driver.findElement(By.id("fname"));
		un.sendKeys("Shweta");
		
		WebElement ln=driver.findElement(By.id("lname"));
		ln.sendKeys("Gadewar");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("shwetasgadewar@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("password");
		
		
		WebElement gender=driver.findElement(By.id("Female"));
		gender.click();
		
		WebElement skills=driver.findElement(By.id("Skills"));
		Select s1=new Select(skills);
		s1.selectByVisibleText("Technical Skills");
		
		WebElement country=driver.findElement(By.id("Country"));
		Select s2=new Select(country);
		s2.selectByVisibleText("India");
		
		
		WebElement present_address=driver.findElement(By.xpath("//textarea[@class='Present-Address form-control']"));
		present_address.sendKeys("Vishal Nagar,pune");
		
		WebElement permanent_address=driver.findElement(By.xpath("//textarea[@class='Permanent-Address form-control']"));
		permanent_address.sendKeys("Rukame Nagar,Ahmedpur");
		
		WebElement pincode=driver.findElement(By.id("Pincode"));
		pincode.sendKeys("413515");
		
		
		WebElement relegion=driver.findElement(By.id("Relegion"));
		Select s3=new Select(relegion);
		s3.selectByVisibleText("Hindu");
		
		WebElement file=driver.findElement(By.id("file"));
		file.sendKeys("C:\\Users\\Shweta Prasad\\Downloads\\APIChitChat.pdf");
		
		WebElement relocate=driver.findElement(By.id("relocate"));
		relocate.click();
		
		WebElement Submit=driver.findElement(By.name("Submit"));
		Submit.click();
	}

}
