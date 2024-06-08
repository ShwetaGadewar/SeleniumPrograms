package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnGmail {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement gmail=driver.findElement(By.xpath("//a[@aria-label='Gmail ']"));
	
		Actions S1=new Actions(driver);
		S1.doubleClick(gmail).perform();
		
		driver.close();
	}

}
