package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("shweta16.gadewar@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("xyz");
        driver.findElement(By.name("login")).click();
	}

}
