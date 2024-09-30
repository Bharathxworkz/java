import java.io.*;

import org.apache.poi.EmptyFileException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateExcelFileExample1
{
    public static void main(String[] args) throws IOException {
//creating an instance of Workbook class
        Workbook wb = new HSSFWorkbook();
//creates an excel file at the specified location
        try {
            OutputStream fileOut = new FileOutputStream("C:\\Users\\LENOVO\\Downloads\\Book.xlsx");
            System.out.println("Excel File has been created successfully.");
            File xlsxFile = new File("C:\\Users\\LENOVO\\Downloads\\Book.xlsx");

//Creating input stream
            FileInputStream inputStream = new FileInputStream(xlsxFile);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = wb.getSheetAt(0);
            //wb.write(fileOut);
        }catch (EmptyFileException e){
            e.printStackTrace();
        }
    }

}