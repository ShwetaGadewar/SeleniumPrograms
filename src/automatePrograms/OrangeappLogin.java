package automatePrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeappLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shwetag-trials713.orangehrmlive.com/auth/login");
	    FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\Mypasswords.xlsx");
        Workbook wb=WorkbookFactory.create(f1);
        
        String un=wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
	    WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	    username.sendKeys(un);
	    
	    String u_password=wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
	    WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	    password.sendKeys(u_password);
	    
	    WebElement login_button=driver.findElement(By.xpath("//button[@type='submit']"));
	    login_button.click();
	    
	    Thread.sleep(2000);
	    WebElement myinfo_link=driver.findElement(By.xpath("(//a[@class='top-level-menu-item'])[2]"));
	    myinfo_link.click();
	    Thread.sleep(3000);
	    
	   // WebElement more=driver.findElement(By.xpath("//a[@class='top-level-menu-item ']"));
       // more.click();
        
        //List<WebElement> l1=driver.findElements(By.xpath("//div[@class='sub-menu-container']/div/a"));
       //l1.get(5).click();
        
        

	    
//	    WebElement appraisals=driver.findElement(By.xpath("(//div[@class='widget-body']/div/a)[1]"));
//	    appraisals.click();
//	    
//	    WebElement my_appraisals=driver.findElement(By.xpath("//a[@class='top-level-menu-item active']"));
//	    my_appraisals.click();
//	    
//	    
//	    WebElement f_appraisal=driver.findElement(By.xpath("(//tr[@ng-repeat='obj in objs track by list.itemTracker(obj, listData.idGetter)'])[1]"));
//	    f_appraisal.click();
	    		
	    
	}

}
