package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment153t0160 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//1) With id=>#id_value
		//WebElement search=driver.findElement(By.cssSelector("#APjFqb"));
		
		//2) With class NAame=>.classname_value
		//WebElement search=driver.findElement(By.cssSelector(".gLFyf"));
		
		//3) Tagname and id
		//WebElement search=driver.findElement(By.cssSelector("textarea#APjFqb"));
		
		//4) tagName and ClassName==>tagname.classname_value =====pending
		//WebElement search=driver.findElement(By.cssSelector(null));
		
		//5) Attribute name and Attribute value=>[AN='AV']

		//WebElement search=driver.findElement(By.cssSelector("[name='q']"));
		
		//6) Tagname, AN and AV=>TN[AN='AV']
		//WebElement search=driver.findElement(By.cssSelector("textarea[name='q']"));
		
	
		//7) Tagname, ClassName,AN and AV=>TN.CN[AN='AV']
		//WebElement search=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		
		//8) With sub string=>tagname[AN^='Sub String of AV']
		WebElement search=driver.findElement(By.cssSelector("textarea[class^='gLF']"));
		search.sendKeys("India");
	}

}
