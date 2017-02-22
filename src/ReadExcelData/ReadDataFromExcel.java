package ReadExcelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by riponctg on 2/20/2017.
 */
public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception{
        File src = new File("D:\\\\ExcelData\\\\TestData.xlsx");
        FileInputStream file = new FileInputStream(src);

        XSSFWorkbook wd = new XSSFWorkbook(file);
        XSSFSheet sheet = wd.getSheetAt(0);

        int rowcount = sheet.getLastRowNum();
        System.out.println(rowcount);

        for(int i = 0; i<rowcount; i++){
            String data = sheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println("Data from row" + data);

        }

    }

}
