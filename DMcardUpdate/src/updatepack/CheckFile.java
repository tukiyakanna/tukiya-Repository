package updatepack;

import java.io.File;

public class CheckFile 
{
	File file;
	
	CheckFile(String path)
	{
		file = new File(path);
	}
	
	boolean check()
	{
		boolean exist = true;
		
		if(file.exists() == false)
		{
			exist = false;
		}
		
		return exist;
	}
}
