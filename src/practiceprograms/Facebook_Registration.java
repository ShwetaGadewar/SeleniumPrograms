package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Registration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createnewaccount = driver.findElement(By.linkText("Create new account"));
		createnewaccount.click();

		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Shweta");
		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys("Gadewar");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("shweta@gmail.com");
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByVisibleText("22");
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("8");
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("2000");
		//WebElement gender = driver.findElement(By.name("//input[@value='1']"));
		//gender.click();

		WebElement sign_button = driver.findElement(By.name("websubmit"));
		sign_button.click();
	}

}
//https://grotechminds.com/hoverover/