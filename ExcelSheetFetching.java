package Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelSheetFetching {
@Test
	public static void method() throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
FileInputStream f1=new FileInputStream("C:\\Users\\prabh\\eclipse-workspace\\Assignmentprojects\\ExcelSheet\\Gowthami.xlsx");
Workbook wb=WorkbookFactory.create(f1);
Sheet s1=wb.getSheet("login");
Row r1=s1.getRow(0);
Cell c1=r1.getCell(0);
String Username=c1.getStringCellValue();
System.out.println(Username);

	}

}
