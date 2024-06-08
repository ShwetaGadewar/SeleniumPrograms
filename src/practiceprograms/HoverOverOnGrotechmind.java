package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverOnGrotechmind {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/hoverover/");
         
		WebElement op1=driver.findElement(By.xpath("//div[@data-id='1857001']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(op1).perform();
	}

}
