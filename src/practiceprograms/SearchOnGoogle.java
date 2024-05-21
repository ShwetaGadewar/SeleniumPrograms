package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOnGoogle {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("india");
   
   //driver.findElement(By.name("btnK")).click();
   // driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
