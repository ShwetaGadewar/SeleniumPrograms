package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlipcart {

	public static void main(String[] args) {
             ChromeDriver driver=new ChromeDriver();
             driver.get("https://www.flipkart.com/");
             driver.findElement(By.name("q")).sendKeys("shoe");
             driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
             
	}

}
