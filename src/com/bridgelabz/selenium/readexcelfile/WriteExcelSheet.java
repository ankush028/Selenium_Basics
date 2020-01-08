package com.bridgelabz.selenium.readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {
	public static void main(String[] args) throws IOException {
		
		File src = new File("/home/admin1/Documents/linkedin.xlsx");
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook xworkbook = new XSSFWorkbook(fis);
			
			XSSFSheet xsheet = xworkbook.getSheet("sheet1");
				
			xsheet.getRow(0).createCell(2).setCellValue("pass");
			xsheet.getRow(1).createCell(2).setCellValue("failed");
			
			FileOutputStream fos = new FileOutputStream(src);
			xworkbook.write(fos);
			xworkbook.close();
			
			
			
	}
	
}
