package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        String path="Files/SDETBatch13.xlsx";
        //navigate to this file
        FileInputStream fileInputStream=new FileInputStream(path);
        //class that understand how Excel files work
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet= (Sheet) xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(0);
        System.out.println(cell);
        fileInputStream.close();
    }
}
