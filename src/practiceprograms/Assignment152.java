package practiceprograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment152 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		WebElement shoe=driver.findElement(By.xpath("(//div[@class='wvIX4U']/div)[1]"));
		shoe.click();
		Set<String> s1=	driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String>	 pcid=		s1.iterator();
			String parentid=		pcid.next();
			String childid=			pcid.next();
			System.out.println(parentid);
			System.out.println(childid);
			
			
			

		
	}

}
