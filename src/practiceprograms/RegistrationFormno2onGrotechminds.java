package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormno2onGrotechminds {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://grotechminds.com/registeration-form/");
		driver.navigate().to("https://grotechminds.com/registeration-form/");
		WebElement fn=driver.findElement(By.id("firstName"));
		fn.sendKeys("Shweta");
		
		WebElement ln=driver.findElement(By.id("lastName"));
		ln.sendKeys("Gadewar");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("shwetasgadewar@gmail.com");
		
		WebElement phone=driver.findElement(By.id("phone"));
		phone.sendKeys("9175943311");
		
		WebElement gender=driver.findElement(By.id("gender"));
		Select s1=new Select(gender);
		s1.selectByIndex(1);
		
		WebElement state=driver.findElement(By.id("state"));
		Select s2=new Select(state);
		s2.selectByIndex(1);
		
		WebElement aadhaar=driver.findElement(By.id("aadhaar"));
		aadhaar.sendKeys("123456789012");
		
		WebElement pan=driver.findElement(By.id("pan"));
		pan.sendKeys("FTGHY9876G");
		
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		
	//	WebElement Submit_button=driver.findElement(By.name("Submit"));
		//Submit_button.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
