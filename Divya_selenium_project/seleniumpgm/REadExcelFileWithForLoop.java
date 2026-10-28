package seleniumpgm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class REadExcelFileWithForLoop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//fetch the file 
		File file=new File("C:\\Users\\admin\\Downloads\\Swaglab (1)");
		
		//Read the file 
		FileInputStream fis=new FileInputStream(file);
		
		//fetch the workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//fetch the sheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		//for rows 
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int cellcount=row.getLastCellNum();
	    for(int j=0;j<cellcount;j++)
	    {
	    	XSSFCell cell=row.getCell(j);
		if(getCellType()==Cell.CELL_TYPE_STRING)
		{
			System.out.println(row.getCell(j).getStringCellValue()+"||");
		}
		else if(getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			System.out.println(row.getCell(j).getNumericCellValue()+"||");
		}
	    }
	  
		}
			
		

	}

	private static int getCellType() {
		// TODO Auto-generated method stub
		return 0;
	}

}
