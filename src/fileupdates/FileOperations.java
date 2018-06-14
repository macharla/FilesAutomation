package fileupdates;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class FileOperations {

	public boolean copyEntireFolder(String folderPath1, String folderPath2)
	{
		try
		{
			
			FileUtils.copyDirectory(new File(folderPath1), new File(folderPath2));
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
}
