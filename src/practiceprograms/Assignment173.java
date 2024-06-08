package practiceprograms;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment173 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\shweta.xlsx");	
        Workbook wb=WorkbookFactory.create(f1);
        String v1=wb.getSheet("password").getRow(2).getCell(1).getStringCellValue();
	System.out.println(v1);
	}

}
