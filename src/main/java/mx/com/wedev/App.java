package mx.com.wedev;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
	    	Properties properties = new Properties();
	    	InputStream propertiesStream 
	    		= App.class.getClassLoader().getResourceAsStream("app.properties");
	    	properties.load(propertiesStream);
	        System.out.println( "Hello World!" );
	        System.out.println( "Application version: " + properties.get("application.version") );
    	} catch (IOException ex) {
    		System.err.println( "Error loading properties file" );
    		ex.printStackTrace();
    		System.exit(1);
    	}
    }
}
