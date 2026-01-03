package Utility;

import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
  public static String getData(String columnName) {
    try (InputStream is = ExcelReader.class
        .getClassLoader()
        .getResourceAsStream("TestData/addEmployee.xlsx")) {
      if (is == null) {
        throw new RuntimeException("Excel file not found in resources");
      }
      System.out.println("Into try block of excel reader");
      Workbook workbook = WorkbookFactory.create(is);
      Sheet sheet = workbook.getSheetAt(0);

      Row headerRow = sheet.getRow(0);
      Row dataRow = sheet.getRow(1);

      DataFormatter formatter = new DataFormatter();

      for (Cell headerCell : headerRow) {
        System.out.println("Into for block of excel reader while reading for cell");
        if (headerCell.getStringCellValue()
            .equalsIgnoreCase(columnName)) {
          System.out.println("Into if block of excel reader while reading for cell");
          int colIndex = headerCell.getColumnIndex();
          return formatter.formatCellValue(
              dataRow.getCell(colIndex));
        }
      }

      throw new RuntimeException("Column not found: " + columnName);

    } catch (Exception e) {
      throw new RuntimeException("Error reading Excel data", e);
    }
  }


}
