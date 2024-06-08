package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrange {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
		login.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");

		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		button.click();

		Thread.sleep(3000);

		String pageTitle = driver.getTitle();
		System.out.println("page Title:" + pageTitle);

		// driver.close();
	}

}
