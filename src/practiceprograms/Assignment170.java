package practiceprograms;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment170 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("paris");
		search.sendKeys(Keys.ENTER);
	
		 TakesScreenshot s1=driver;
		 File source=s1.getScreenshotAs(OutputType.FILE);
		 String className = Assignment170.class.getSimpleName();
		// System.out.println(className);
		 File destination=new File("D:\\Grotechminds\\Screenshots\\"+"shweta"+className+".png");
		 FileHandler.copy(source, destination);
	}
}
