package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static Logger log = Logger.getLogger(Write_Data.class);

	public static void write() throws IOException {

		BasicConfigurator.configure();

		File f = new File("C:\\Users\\Itachi_Uchiha\\Desktop\\Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Student_Data").createRow(0).createCell(0).setCellValue("Name");

		wb.getSheet("Student_Data").getRow(0).createCell(1).setCellValue("ID");

		wb.getSheet("Student_Data").createRow(1).createCell(0).setCellValue("Starc");

		wb.getSheet("Student_Data").getRow(1).createCell(1).setCellValue(17);

		wb.getSheet("Student_Data").createRow(2).createCell(0).setCellValue("Smith");

		wb.getSheet("Student_Data").getRow(2).createCell(1).setCellValue(10);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		log.info("write successfully");

	}

	public static void main(String[] args) throws IOException {

		write();

	}

}
