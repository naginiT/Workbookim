package Executions;

import org.testng.annotations.Test;

import Actions.RegisActions;
import Objects.RegisBrowser;

public class RegisExec extends RegisActions
	{
	@Test
	public void execu() throws Exception 
	{
		Thread.sleep(5000);
		RegisBrowser.browserm();
		
		RegisExec obj=new RegisExec();
		obj.data("D:\\imran\\exce\\Bookstore.xlsx","Sheet1");
		
	}
	
}
