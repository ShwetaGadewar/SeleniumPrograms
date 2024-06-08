package practiceprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment179 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\shweta.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		
		String fn=wb.getSheet("Grotechmindlogin").getRow(0).getCell(0).getStringCellValue();
		String ln=wb.getSheet("Grotechmindlogin").getRow(0).getCell(1).getStringCellValue();
        String email=wb.getSheet("Grotechmindlogin").getRow(0).getCell(2).getStringCellValue();
        String mobile_no=NumberToTextConverter.toText(wb.getSheet("Grotechmindlogin").getRow(0).getCell(3).getNumericCellValue());
		String gender=wb.getSheet("Grotechmindlogin").getRow(0).getCell(4).getStringCellValue();
		String state=wb.getSheet("Grotechmindlogin").getRow(0).getCell(5).getStringCellValue();
        String aadharno=NumberToTextConverter.toText(wb.getSheet("Grotechmindlogin").getRow(0).getCell(6).getNumericCellValue());
		String pan=wb.getSheet("Grotechmindlogin").getRow(0).getCell(7).getStringCellValue();

		
		WebElement u_fn=driver.findElement(By.id("firstName"));
		u_fn.sendKeys(fn);
		
        WebElement u_ln=driver.findElement(By.id("lastName"));
		u_ln.sendKeys(ln);
		
		WebElement u_email=driver.findElement(By.id("email"));
		u_email.sendKeys(email);
		
		WebElement phone=driver.findElement(By.id("phone"));
		phone.sendKeys(mobile_no);
		
		WebElement u_gender=driver.findElement(By.id("gender"));
		Select s1=new Select(u_gender);
		s1.selectByVisibleText(gender);
		
		WebElement u_state=driver.findElement(By.id("state"));
		Select s2=new Select(u_state);
		s2.selectByVisibleText(state);
		
		WebElement u_aadhaar=driver.findElement(By.id("aadhaar"));
		u_aadhaar.sendKeys(aadharno);
		
		WebElement u_pan=driver.findElement(By.id("pan"));
		u_pan.sendKeys(pan);
		
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		
	    WebElement Submit_button=driver.findElement(By.name("Submit"));
	    Submit_button.click();

	}

}
