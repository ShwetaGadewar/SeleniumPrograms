package practiceprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment163 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIpdeQ5rHBhgMVadIWBR2S_i6UEAAYASAAEgLsnfD_BwE&gclsrc=aw.ds");
		
		
		WebElement google=driver.findElement(By.xpath("//button[.='Google']"));
		google.click();
		
		Set<String> s1=driver.getWindowHandles();
	    System.out.println(s1);
	    
	    Iterator<String> parent_childid=s1.iterator();
	    String p=parent_childid.next();
	    String c=parent_childid.next();
	    
	    System.out.println(p);
	    System.out.println(c);
	    
	    driver.switchTo().window(c);
	    
	    WebElement email=driver.findElement(By.id("identifierId"));
	    email.sendKeys("shwetasgadewar@gmail.com");
	    
		
			
	}

}
