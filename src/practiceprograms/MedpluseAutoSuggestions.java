package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedpluseAutoSuggestions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.medplusmart.com/");
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for... General or Pharma products']"));
		search.sendKeys("pan");
		search.sendKeys(Keys.ENTER);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='rbt-menu dropdown-menu show search-result']/div/a"));
		int count = list.size();
		System.out.println(count);
		list.get(4).click();
	}

}
