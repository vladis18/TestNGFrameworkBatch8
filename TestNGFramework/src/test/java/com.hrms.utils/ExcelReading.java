package com.hrms.utils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReading {
    static Workbook book ;
    //static Sheet sheet;
    public static void openExcel(String filePath){
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
          //  book = new XSSFWorkbook(fileInputStream);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
       // catch (IIOException e){
          //  e.printStackTrace();
     //   }

        //public.getSheet
    }
}
