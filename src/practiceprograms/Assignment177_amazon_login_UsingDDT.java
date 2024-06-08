package practiceprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment177_amazon_login_UsingDDT {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		FileInputStream f1 = new FileInputStream(
				"D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\shweta.xlsx");
		Workbook wb = WorkbookFactory.create(f1);

		String email = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		WebElement signin = driver.findElement(By.id("ap_email"));
		signin.sendKeys(email);
		WebElement continue_button = driver.findElement(By.id("continue"));
		continue_button.click();
		String password = wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		WebElement password1 = driver.findElement(By.id("ap_password"));
		password1.sendKeys("password");
        
		
		
		WebElement signin_button = driver.findElement(By.id("signInSubmit"));
		signin_button.click();

	}

}
