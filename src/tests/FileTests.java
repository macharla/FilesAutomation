package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fileupdates.FileOperations;

public class FileTests {

	@Test
	@Parameters({ "folderPath1", "folderPath2" })
	public void verifyCopyTest(String folderPath1, String folderPath2) 
	{
		System.out.println(folderPath1);
		System.out.println(folderPath2);
		boolean isFileCopied = false;
		try {
			FileOperations fiu= new FileOperations();
			isFileCopied = fiu.copyEntireFolder(folderPath1, folderPath2);
			System.out.println(isFileCopied);
			assertTrue(isFileCopied, "File has been copied from :"+folderPath1 +"  to:" + folderPath2);	
		}
		catch(Exception e)
		{
			assertTrue(isFileCopied, "There was an exception while copying file from :"+folderPath1 +"  to:" + folderPath2);
		}
		
		
	}
}
