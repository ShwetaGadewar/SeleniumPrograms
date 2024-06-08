package practiceprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTypeDynamincXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		
	}

}
