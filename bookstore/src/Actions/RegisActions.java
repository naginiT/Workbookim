package Actions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.RegisObjects;

public class RegisActions
	{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	public void data(String path, String value) throws Exception
	{
		/*RegisObjects.frstname().sendKeys("md");
		RegisObjects.lastname().sendKeys("immu");*/
		
		
				File f1=new File(path);
				FileInputStream fis=new FileInputStream(f1);
				workbook =new XSSFWorkbook(fis);
				sheet = workbook.getSheet(value);
		 	 
		 	 for(int i=1;i<=sheet.getLastRowNum();i++)
		 	 {
		 		
		 		 cell=sheet.getRow(i).getCell(1);
		 		 if(cell.getCellType()==cell.CELL_TYPE_STRING)
		 		 {
		 			 
					 //cell =sheet.getRow(i).getCell(1);
		 			 RegisObjects.frstname().sendKeys(cell.getStringCellValue());
					 cell =sheet.getRow(i).getCell(2);
		 			 RegisObjects.lastname().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(3);
		 			 RegisObjects.mail().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(4);
		 			if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC)
		 			{
				    	long n=(long)cell.getNumericCellValue();
				    		String s=String.valueOf(n);
				    	            System.out.println(s);
				    	            Thread.sleep(5000);
				    	            RegisObjects.postcode().sendKeys(s);
				   			   }
				       else
				       {
				    	   RegisObjects.contact().sendKeys(cell.getStringCellValue());
				       }
		 			 cell =sheet.getRow(i).getCell(5);
		 			if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) 
		 			{
				    	long n=(long)cell.getNumericCellValue();
				    		String st=String.valueOf(n);
				    	            System.out.println(st);
				    	            Thread.sleep(5000);
				    	            RegisObjects.postcode().sendKeys(st);
				   			   }
				       else
				       {
		 			 
		 			 RegisObjects.faxx().sendKeys(cell.getStringCellValue());
		 		 }
		 			 cell =sheet.getRow(i).getCell(6);
		 			 RegisObjects.company().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(7);
		 			if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC)
		 			{
				    	int n=(int)cell.getNumericCellValue();
				    		String str=String.valueOf(n);
				    	            System.out.println(str);
				    	            Thread.sleep(5000);
				    	            RegisObjects.postcode().sendKeys(str);
				   			   }
				       else
				       {
		 			 RegisObjects.add().sendKeys(cell.getStringCellValue());
				       }
		 			 cell =sheet.getRow(i).getCell(8);
		 			 RegisObjects.Add2().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(9);
		 			 RegisObjects.place().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(10);
		 			if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC)
		 			{
				    	long n=(long)cell.getNumericCellValue();
				    		String g=String.valueOf(n);
				    	            System.out.println(g);
				    	            Thread.sleep(5000);
				    	            RegisObjects.postcode().sendKeys(g);
				   			   }
				       else
				       {
		 			 RegisObjects.postcode().sendKeys(cell.getStringCellValue());
				       }
		 			 cell =sheet.getRow(i).getCell(11);
		 			 RegisObjects.countrie().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(12);
		 			 RegisObjects.Statee().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(13);
		 			 RegisObjects.passwrd().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(14);
		 			 RegisObjects.newpassword().sendKeys(cell.getStringCellValue());
		 			 cell =sheet.getRow(i).getCell(15);
		 			 RegisObjects.subscribe().click();
		 			 cell =sheet.getRow(i).getCell(16);
		 			 RegisObjects.accept().click();
		 			 cell =sheet.getRow(i).getCell(17);
		 			 RegisObjects.contiune().click();
		 			 
		 		 }
		 	 }
	}

}
