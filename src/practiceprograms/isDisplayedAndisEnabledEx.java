package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedAndisEnabledEx {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		if(search.isDisplayed() && search.isEnabled()) {
			search.sendKeys("india");
			Thread.sleep(2000);
		}
		List<WebElement> india_count=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=india_count.size();	
		System.out.println(count);
		india_count.get(4).click();

	}

}
