package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment166 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		WebElement click=driver.findElement(By.xpath("//button[@class='btnjs']"));
		click.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
	}

}
