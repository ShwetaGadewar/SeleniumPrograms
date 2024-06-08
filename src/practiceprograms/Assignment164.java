package practiceprograms;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment164 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		
		WebElement shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		shoe.click();
		Set<String> s1=	driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pcid=s1.iterator();
			String parentid=pcid.next();
			String childid=	pcid.next();
			System.out.println(parentid);
			System.out.println(childid);
			driver.switchTo().window(childid);
			
			WebElement addTowishlist=driver.findElement(By.xpath("//a[@class='a-button-text a-text-left']"));
			addTowishlist.click();
			
			WebElement signin=driver.findElement(By.id("ap_email"));
			signin.sendKeys("prasad.chakkarwar@gmail.com");
			
			WebElement continue_button=driver.findElement(By.id("continue"));
			continue_button.click();
			
			
			WebElement password=driver.findElement(By.id("ap_password"));
			password.sendKeys("PasswordForSachin");
			
			
			WebElement signin_button=driver.findElement(By.id("signInSubmit"));
			signin_button.click();
			
			
			WebElement addtocartbutton=driver.findElement(By.id("add-to-cart-button"));
			addtocartbutton.click();
			
			WebElement proceedToRetailCheckout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
			proceedToRetailCheckout.click();
			
			

	}

}
