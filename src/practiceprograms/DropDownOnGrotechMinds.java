package practiceprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOnGrotechMinds {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/dropdown/");
driver.manage().window().maximize();


WebElement C1=driver.findElement(By.id("Choice1"));
Select choice1=new Select(C1);
choice1.selectByValue("Demo7");
List<WebElement> count=			choice1.getOptions();
		System.out.println(count.size());


/*
WebElement C2=driver.findElement(By.id("Choice2"));
Select choice2=new Select(C2);
choice2.selectByVisibleText("practice3");

WebElement C3=driver.findElement(By.id("Choice3"));
Select choice3=new Select(C3);
choice3.selectByValue("Power3");

WebElement C4=driver.findElement(By.id("Choice4"));
Select choice4=new Select(C4);
choice4.selectByIndex(1);

WebElement C5=driver.findElement(By.id("Choice5"));
Select choice5=new Select(C5);
choice5.selectByVisibleText("Day3");

WebElement C6=driver.findElement(By.id("Choice6"));
Select choice6=new Select(C6);
choice6.selectByValue("Night15");

WebElement C7=driver.findElement(By.id("Choice7"));
Select choice7=new Select(C7);
choice7.selectByVisibleText("Night6");
*/
	}

}
