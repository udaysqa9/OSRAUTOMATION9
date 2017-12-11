package generics;

import java.io.FileInputStream;
import java.util.Properties;

public class UtilityLibrary {
	
	    public static String getProperty(String path,String key)
	{
	    String value = "";
	  try {
	   Properties props = new Properties();
	   props.load(new FileInputStream(path));
	  value=props.getProperty(key);
	}

	catch(Exception e)
	{
	}

	return value;
	}
}

