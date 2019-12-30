package com.bridgelabz.selenium.library;

import java.io.IOException;

public class ReadExcelData {
	public static void main(String[] args) throws IOException {
		
		ExcelDataConfig excel = new ExcelDataConfig();
		System.out.println(excel.getData(0,0,1));		
	}
}
