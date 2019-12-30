package com.bridgelabz.selenium.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook xwb;
	XSSFSheet xsheet;
	
	public ExcelDataConfig() throws IOException {
		
	
	File src = new File("/home/admin1/Downloads/OnlineTestCampaign_export_1577516865962.xlsx");


	FileInputStream	fis = new FileInputStream(src);
			xwb =  new XSSFWorkbook(fis);
			
	 
	}
	public String getData(int sheetno,int row,int column) {
		
		xsheet=	xwb.getSheetAt(sheetno);
		String data = xsheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
}