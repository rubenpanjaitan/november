package net.myinfosys.novembertraining.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePropertisXml {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		FileInputStream fis = null;
		Properties propertis = new Properties();
		
		try{
			fos = new FileOutputStream("user.xml");
			propertis.setProperty("nama", "ruben");
			propertis.setProperty("id", "if313107");
			propertis.storeToXML(fos, "user ");
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			fos.close();
		}
		
		//read xml
		try{
			fis = new FileInputStream("user.xml");
			propertis.loadFromXML(fis);
			for(String prop : propertis.stringPropertyNames()){
				System.out.println("<"+prop+">" + propertis.getProperty(prop));
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			fis.close();
		}
		
	}

}
