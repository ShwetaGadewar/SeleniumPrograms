package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment159 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search=driver.findElement(By.cssSelector("input[class='Pke_EE']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		List<WebElement> shoe=driver.findElements(By.cssSelector("div[class='wvIX4U']"));
		shoe.get(0).click();

	}

}//Using CSS Selector