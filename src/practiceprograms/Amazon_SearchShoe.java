package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_SearchShoe {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> s=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int size=s.size();
		System.out.println(size);
		s.get(3).click();
	
	}

}
