package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class CheckExcelUtil {

	
	public static void main(String[] args) {
		
		String path=".//data//UsersVersion1.xlsx";
		String sheet = "Sheet1";
		try {
			String osrData = generics.Excel.getData(path,1,0,sheet);
			short columnCount=generics.Excel.display(path,sheet,1);
			int rownumbers = generics.Excel.getRowCount(path, sheet);
		System.out.println("data++++++++>"+osrData);
		System.out.println("row numbers++++++++>"+rownumbers);
		System.out.println("Column count++++++++>"+columnCount);
		
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
