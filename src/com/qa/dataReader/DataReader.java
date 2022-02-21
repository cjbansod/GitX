package com.qa.dataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class DataReader {

	XSSFWorkbook workbook;
	XSSFSheet worksheet;
	XSSFRow row;
	XSSFCell cell;
	public void setup() throws IOException {
		File file=new File("D:\\P\\Mar\\TestDataFile.xlsx");
		try {
			FileInputStream fis=new FileInputStream(file);
			workbook=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String getExcelData(int rownumber,String sheetname,String columnname) throws IOException 
	{
		setup();
		worksheet=workbook.getSheet(sheetname);	
		return "";
	}


	public void Getrowvalues(String sheetname,String tcid) throws IOException 
	{
		setup();
		worksheet=workbook.getSheet(sheetname);
		int totalrowcount=GetRowCount(sheetname);
		int currentrow=0;
		for(int i=0;i<totalrowcount;i++) 
		{
			row=worksheet.getRow(i);
			int cellcount=GetCellCount(sheetname, row.getRowNum());
			for(int j=0;j<=cellcount;j++) 
			{
				cell=row.getCell(1);
				if(cell.getStringCellValue().trim().equals(tcid)) 
				{
					System.out.println(row.getCell(j).getStringCellValue());
				}
			}
		}
	}


	public int GetRowCount(String sheetname) throws IOException {
		int rowcount=0;
		setup();
		worksheet=workbook.getSheet(sheetname);
		rowcount=worksheet.getLastRowNum();
		workbook.close();
		return rowcount;
	}

	public int GetCellCount(String sheetname,int rownumber) throws IOException {
		int cellcount=0;
		setup();
		worksheet=workbook.getSheet(sheetname);
		XSSFRow row= worksheet.getRow(rownumber);	
		cellcount=row.getLastCellNum();
		workbook.close();
		return cellcount;
	}

	
	public static void main(String[] args) throws IOException {
    DataReader data=new DataReader();
    data.Getrowvalues("Sheet1", "Login");
	}
}
