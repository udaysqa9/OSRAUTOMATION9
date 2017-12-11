package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {


	public static String getData(String path,int rowNum,int cellNum,String sheetName) throws EncryptedDocumentException, 
	InvalidFormatException, FileNotFoundException, IOException {

		//Workbook wb = WorkbookFactory.create(new FileInputStream("D:\\SonySelenium\\OSRAUTOMATION9\\data\\UsersVersion1.xlsx"));
		//Workbook wb = WorkbookFactory.create(new FileInputStream(".\\data\\UsersVersion1.xlsx"));
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String cellData = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return cellData;
	}

	public static int getRowCount(String path,String sheet) throws EncryptedDocumentException, 
	InvalidFormatException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	
	
	public static short display(String path,String sheet,int rowNum) throws EncryptedDocumentException,
	InvalidFormatException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		short colCount = wb.getSheet(sheet).getRow(rowNum).getLastCellNum();
		return colCount;
	}
	
	
	

//	public static int getColumnCount(String path,String sheet) throws EncryptedDocumentException, 
//	InvalidFormatException, FileNotFoundException, IOException
//	{
//		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
//		int columnCount = wb.getSheet(sheet).getLastCellNum();
//		return columnCount;
//	}




}
