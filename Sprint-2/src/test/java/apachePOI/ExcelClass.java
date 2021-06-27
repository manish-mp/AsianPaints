package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class ExcelClass {
	WebDriver driver;
	String num;
	int number;
	public int CarpetAreaXl() throws Exception
	{
		File f=new File("C://Users//VANDANA//selenium_workspace//Sprint-2//src//test//resources//xlFile//DataFile.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		number= (int) sheet.getRow(0).getCell(0).getNumericCellValue();
		num=Integer.toString(number);
		//System.out.println(number);
		return number;


	}

	public String CityNameXl() throws Exception
	{
		File f=new File("C://Users//VANDANA//selenium_workspace//Sprint-2//src//test//resources//xlFile//DataFile.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		num= (String) sheet.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(num);
		return num;


	}

}
