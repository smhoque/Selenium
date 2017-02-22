package lib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by riponctg on 2/20/2017.
 */
public class ExcelDataConfig {
    XSSFWorkbook wd;
    XSSFSheet sheet;

    public ExcelDataConfig(String excelPath) {
        try {
            File src = new File(excelPath);
            FileInputStream file = null;
            file = new FileInputStream(src);
            wd = new XSSFWorkbook(file);




        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    public String getData(int sheetNumber, int row, int column){
        sheet = wd.getSheetAt(sheetNumber);
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}
