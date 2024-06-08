package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOutTheLinksOnParticularPage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
	for(int i=0;i<count;i++) {
			WebElement s1=links.get(i);
			String link=s1.getText();	
			System.out.println(link);
			}

	}

}
