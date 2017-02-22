package ReadExcelData;

import lib.ExcelDataConfig;

/**
 * Created by riponctg on 2/20/2017.
 */
public class ReadExcelData {
    public static void main(String[] args) {
        ExcelDataConfig excel = new ExcelDataConfig("D:\\\\ExcelData\\\\TestData.xlsx");
       System.out.println(excel.getData(1,0,0));
    }
}
