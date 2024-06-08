package practiceprograms;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class CovertTheNumericToTextValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("D:\\eclipse-workspace\\Seleniun_Basixs_programs\\TestData\\shweta.xlsx");	
        Workbook wb=WorkbookFactory.create(f1);
      
        
        String mobile_no=NumberToTextConverter.toText(wb.getSheet("password").getRow(1).getCell(0).getNumericCellValue());
        System.out.println(mobile_no);

	}

}
