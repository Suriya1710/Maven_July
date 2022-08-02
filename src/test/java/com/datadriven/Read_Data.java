package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static Workbook wb; // ---> null

	public static String value; // --> null

	public Read_Data() throws IOException {

		File f = new File("C:\\Eclipse\\Maven_Project_July15\\Dummy_Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		wb = new XSSFWorkbook(fis);

	}

	public  String particular_Data() throws IOException {

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(2);

		Cell c = r.getCell(0);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();

		}

		else if (type.equals(CellType.NUMERIC)) {

			double numericCellValue = c.getNumericCellValue();

			// double to String

			value = String.valueOf(numericCellValue);

		}

		return value;

	}

	public  void all_Data() throws IOException {

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++)

		{

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++)

			{

				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING))

				{

					String value = c.getStringCellValue();

					System.out.print(value + " ");

				}

				else if (type.equals(CellType.NUMERIC))

				{

					double numeric_Value = c.getNumericCellValue();

					String value = String.valueOf(numeric_Value);

					System.out.print(value + " ");

				}

			}

			System.out.println();

		}


	}

	public static void main(String[] args) throws IOException {

		Read_Data data = new Read_Data();
		
		System.out.println(data.particular_Data());
		
		data.all_Data();
		
		
	}

}
