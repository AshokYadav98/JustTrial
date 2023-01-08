package ExelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exa1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
         File myfile=new File("F:\\MY DOCUMENTS\\my new selenium file\\ExelReaderSetup\\poi-bin-5.2.3\\MyExelWork.xlsx");
	     
	     Sheet Mysheet = WorkbookFactory.create(myfile).getSheet("Sheet7");
	      
	     String Myname = Mysheet.getRow(3).getCell(0).getStringCellValue();
	    
	     System.out.println("My Name Is "+Myname);
	    
	     //How to read Whole Row from Exel Sheet
	    
	     for(int i=0;i<=4;i++)
	     {
	    	String value1 = Mysheet.getRow(5).getCell(i).getStringCellValue();
	    	
	    	System.out.print(value1+" ");
	     }
	     System.out.println();
	     
	     //how to read whole row from exel sheet
	     
	     for(int i=0;i<=9;i++)
	     {
	    	String value2 = Mysheet.getRow(i).getCell(5).getStringCellValue();
	    	
	    	System.out.println(value2);
	     }
	     System.out.println();
	     
	     
	     

	}

}
