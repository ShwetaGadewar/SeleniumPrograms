package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("email")).sendKeys("shweta16.gadewar@gmail.com");
		// driver.findElement(By.id("pass")).sendKeys("xyz");
		// driver.findElement(By.name("login")).click();
		WebElement createnewaccount = driver.findElement(By.linkText("Create new account"));
		createnewaccount.click();

		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Shweta");
		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys("Gadewar");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("shweta@gmail.com");

		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("shweta@gmail.com");
         // Thread.sleep(5000);
          //WebElement password_confirmation= driver.findElement(By.id("reg_email_confirmation__"));
          //password_confirmation.sendKeys("shweta@gmail.com");
          
		WebElement sign_button = driver.findElement(By.name("websubmit"));
		sign_button.click();
	}

}
