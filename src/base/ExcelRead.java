package base;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static XSSFWorkbook ExcelWBook;
	static XSSFSheet ExcelSheet;
	static  XSSFCell cell;
	
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Rahul\\workspace\\TestNG1\\src\\base\\ExcelRead.xlsx";
		String sheetname="User_data";
		
		FileInputStream input=new FileInputStream(path);
		ExcelWBook=new XSSFWorkbook(input);
		
		ExcelSheet=ExcelWBook.getSheet(sheetname);
		
		cell=ExcelSheet.getRow(1).getCell(2);
		
		String cellData=cell.getStringCellValue();
		
		System.out.println("Cell value is: "+cellData);
		
		

	}

}
