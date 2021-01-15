package com.hrms.testcases;




import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFilesDemo {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\pishi\\Documents\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        for (int i =1; i<sheet.getPhysicalNumberOfRows();i++) {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            Row row = sheet.getRow(i);
            Person person = new Person();
            person.setFirstName((row.getCell(0).toString()));
            person.setLastName(row.getCell(1).toString());
            //person.setAge(int)row.getCell(2).getNumericCellValue());//.parseInt(row.getCell(2).toString()));
            person.setAge((int)row.getCell(2).getNumericCellValue());


        }
    }
}
