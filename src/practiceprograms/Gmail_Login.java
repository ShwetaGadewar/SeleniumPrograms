package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
//WebElement gmail=driver.findElement(By.linkText("Gmail"));
	    WebElement gmail=driver.findElement(By.partialLinkText("Gma"));    
gmail.click();
	}

}
