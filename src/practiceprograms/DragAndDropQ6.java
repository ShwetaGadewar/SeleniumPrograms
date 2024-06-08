package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropQ6 {

	public static void main(String[] args) {
		//6 Write a code to drag and drop Jenkins 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement drag=driver.findElement(By.xpath("(//div[@id='container'])[3]"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(drag, drop).perform();
		driver.close();
	}

}
