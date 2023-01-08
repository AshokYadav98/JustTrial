package ExelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exa2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        File myfile=new File("F:\\MY DOCUMENTS\\my new selenium file\\ExelReaderSetup\\poi-bin-5.2.3\\MyExelWork.xlsx");
        
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet8");
        
        //How to read whole exel sheet
        
        //varry-->Row 
        //varry-->column
        
        for(int i=0;i<=5;i++)
        {
        	
        for(int j=0;j<=4;j++)
        {
        	String value = mysheet.getRow(i).getCell(j).getStringCellValue();
        	
        	System.out.print(value+" ");
        }
        System.out.println();
        }
        
        

	}

}
