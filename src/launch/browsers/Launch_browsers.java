package launch.browsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_browsers {
	public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();	
    //FirefoxDriver driver=new FirefoxDriver();
	//EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getTitle());

	}
		
	
}
