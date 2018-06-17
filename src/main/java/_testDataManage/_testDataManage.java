package _testDataManage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _testDataManage {
	public static String getDataSheetENV(String ColumnName, String RowName) {
		Cell cell=null;
		Row row=null;
		int f=0,g=0,i=0,j=0;
		String z=null;
			try{
				String filepath=System.getProperty("user.dir")+"\\TestData";
				String filename="Environment.xlsx";
				File file=new File(filepath+"\\"+filename);
				FileInputStream input=new FileInputStream(file);
				//String fileExtensionName = filename.substring(filename.indexOf("."));
				Workbook wb=new XSSFWorkbook(input);			
				 Sheet sh=wb.getSheet("ENV");
				int noofrows=sh.getLastRowNum();
				System.out.println("number of rows: "+noofrows);
				int lastcolumnno=sh.getRow(0).getLastCellNum();
				for(i=0;i<=noofrows;i++)
				{
					for(j=0;j<=lastcolumnno-1;j++)
					{
						row=sh.getRow(i);
						cell=row.getCell(j);
						String d=cell.getStringCellValue();
						if(d.equalsIgnoreCase(RowName))
						{
							f=cell.getRowIndex();
						}
						if(d.equals(ColumnName))
						{
							g=cell.getColumnIndex();						
						}
						row=sh.getRow(f);
						cell=row.getCell(g);				
					}				
				}
				z=cell.getStringCellValue();
				wb.close();
			}catch(Exception e)
			{e.printStackTrace();}
			return z;
		}
	
	public static String getTestData(String ColumnName, String RowName) {
		Cell cell=null;
		Row row=null;
		int f=0,g=0,i=0,j=0;
		String z=null;
			try{
				String filepath=System.getProperty("user.dir")+"\\TestData";
				String filename="FreeCRMDataSheet.xlsx";
				File file=new File(filepath+"\\"+filename);
				FileInputStream input=new FileInputStream(file);
				//String fileExtensionName = filename.substring(filename.indexOf("."));
				Workbook wb=new XSSFWorkbook(input);			
				 Sheet sh=wb.getSheet("TestData");
				int noofrows=sh.getLastRowNum();
				System.out.println("number of rows: "+noofrows);
				int lastcolumnno=sh.getRow(0).getLastCellNum();
				for(i=0;i<=noofrows;i++)
				{
					for(j=0;j<=lastcolumnno-1;j++)
					{
						row=sh.getRow(i);
						cell=row.getCell(j);
						String d=cell.getStringCellValue();
						if(d.equalsIgnoreCase(RowName))
						{
							f=cell.getRowIndex();
						}
						if(d.equals(ColumnName))
						{
							g=cell.getColumnIndex();						
						}
						row=sh.getRow(f);
						cell=row.getCell(g);				
					}				
				}
				z=cell.getStringCellValue();
				wb.close();
			}catch(Exception e)
			{e.printStackTrace();}
			return z;
		}
	
	


}
