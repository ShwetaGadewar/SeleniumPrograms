package automatePrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:facebook.com");
		
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\Mypasswords.xlsx");	
        Workbook wb=WorkbookFactory.create(f1);
        String email_data=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
        String password_data=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();

        WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(email_data);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(password_data);
		
		WebElement login_button=driver.findElement(By.name("login"));
		login_button.click();
		
		

	}

}
