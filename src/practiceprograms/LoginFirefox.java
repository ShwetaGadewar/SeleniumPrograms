package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFirefox {

	public static void main(String[] args) {
FirefoxDriver driver =new FirefoxDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("india");

driver.findElement(By.name("btnK")).click();
	}

}
