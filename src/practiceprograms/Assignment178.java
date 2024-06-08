package practiceprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment178 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-orders%2Forders%3Fref_%3Dya_d_c_yo&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_retail_yourorders_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		FileInputStream s1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\shweta.xlsx");
		Workbook wb=WorkbookFactory.create(s1);
		String un=wb.getSheet("amazonlogin").getRow(0).getCell(0).getStringCellValue();
		
		String email_id=wb.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();
		
		String password=wb.getSheet("amazonlogin").getRow(0).getCell(2).getStringCellValue();
		
		WebElement createaccount=driver.findElement(By.id("createAccountSubmit"));
		createaccount.click();
		
		WebElement ap_customer_name=driver.findElement(By.id("ap_customer_name"));
		ap_customer_name.sendKeys(un);
		
		WebElement cust_email_id=driver.findElement(By.id("ap_email"));
		cust_email_id.sendKeys(email_id);
		
		WebElement cust_password=driver.findElement(By.id("ap_password"));
		cust_password.sendKeys(password);
		
		WebElement again_cust_password=driver.findElement(By.id("ap_password_check"));
		again_cust_password.sendKeys(password);
		
	}

}
