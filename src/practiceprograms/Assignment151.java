package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment151 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		List<WebElement> shoe=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']/div"));
		shoe.get(0).click();
	}

}
