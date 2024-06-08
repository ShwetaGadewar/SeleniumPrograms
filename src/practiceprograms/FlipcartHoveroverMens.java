package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartHoveroverMens {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement fashion = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[3]"));
		Actions s1 = new Actions(driver);
		s1.moveToElement(fashion).perform();
		
		WebElement menstopwear = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		s1.moveToElement(menstopwear).perform();
		
		WebElement menstshirts = driver.findElement(By.linkText("Men's T-Shirts"));
		menstshirts.click();
	}

}
