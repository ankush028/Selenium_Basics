package com.bridgelabz.selenium.readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	public static void main(String[] args) throws IOException {
		File src = new File("/home/admin1/Downloads/OnlineTestCampaign_export_1577516865962.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xwb =  new XSSFWorkbook(fis);
		XSSFSheet xsheet=	xwb.getSheet("data");
		
		
//		String data = xsheet.getRow(1).getCell(2).getStringCellValue();
//		System.out.println("Data from excel :"+data );
	
		int rowcount =xsheet.getLastRowNum();
		System.out.println("total rows is :"+rowcount);
		
		for (int i=0;i<rowcount;i++) {
			String data = xsheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Data from row "+i+" is"+data);
		}
		
		
		xwb.close();
	}
}
