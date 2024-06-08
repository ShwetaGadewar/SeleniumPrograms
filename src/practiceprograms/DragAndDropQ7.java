package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropQ7 {

	public static void main(String[] args) {
		//7 Write a code to drag and drop Spring Boot
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement drag=driver.findElement(By.xpath("(//div[@id='container'])[10]"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(drag, drop).perform();
		driver.close();

	}

}
