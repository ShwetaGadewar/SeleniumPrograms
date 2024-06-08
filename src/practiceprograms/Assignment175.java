package practiceprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment175 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
   
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\shweta.xlsx");	
        Workbook wb=WorkbookFactory.create(f1);
        Sheet s1=wb.getSheet("password");
        Row r1=s1.getRow(1);
        Cell c1=r1.getCell(1);
        String Value1=c1.getStringCellValue();
        System.out.println(Value1);
	}

}
