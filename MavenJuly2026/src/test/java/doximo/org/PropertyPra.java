package doximo.org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyPra {
	
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream fs=new FileInputStream ("C:\\Users\\malat\\eclipse-workspace\\MavenJuly2026\\Data.properties");
	
	Properties t=new Properties();
	t.load(fs);
	String property = t.getProperty("browser");
	System.out.println(property);

}
}