package com.framework;




import java.io.IOException;



import org.testng.annotations.Test;



public class DragAndDropTest extends BaseClass {

	

	

	
	@Test 
	
	
	void execute() throws IOException 
	{
		
		
		
		
	
		DragnDropPg obj = new DragnDropPg(driver);
		
		
	
		
		System.out.println("A:" + "  " + Helper.getText(obj.A));
		System.out.println("B:"+ "  " + Helper.getText(obj.B));
		
		System.out.println("---------");
		
		ActionsClass action = new ActionsClass(driver);
		action.scroll(0, 1233);
		action.dragAndDrop(obj.A, obj.B);
		//action.dragAndDrop(obj.B, -150, 0);
		
		
		String a = Helper.getText(obj.A);
		String b = Helper.getText(obj.B);
		 
		 System.out.println("A:"+"  " + a);
			System.out.println("B:" + "  " + b);
		 
	}
	
	

	
}
